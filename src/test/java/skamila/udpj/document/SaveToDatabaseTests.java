package skamila.udpj.document;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.TransactionSystemException;
import skamila.udpj.document.dto.DocumentDto;
import skamila.udpj.document.dto.LetterDto;
import skamila.udpj.document.service.AddresseeService;
import skamila.udpj.document.service.DocumentService;
import skamila.udpj.document.service.LetterService;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class SaveToDatabaseTests {

    @Autowired
    private DocumentService documentService;

    @Autowired
    private LetterService letterService;

    @Autowired
    AddresseeService addresseeService;

    @Test
    public void saveAddressee() {
        addresseeService.addAddressee("Zbigniew");
    }

    @Test
    public void saveDocument() {
        Set<String> tags = new HashSet<>();
        tags.add("zawidomienie");
        tags.add("ważne");
        DocumentDto documentDto = DocumentDto.builder()
                .title("Zawiadomienie")
                .content("Dnia 05-05-2021 będzie przerwa w dostawie energii elektrycznej w godzinach 8:00-10:00.")
                .tags(tags)
                .build();
        documentService.addDocument(documentDto);
    }

    @Test
    public void saveLetter() {
        LetterDto letter = LetterDto.builder()
                .title("List do Ani")
                .content("Cześć Ania, co słychać?")
                .addressee("Anna")
                .build();
        letterService.addLetter(letter);
    }

    @Test
    public void saveDocumentWithWrongContent() {
        DocumentDto documentDto = DocumentDto.builder()
                .title("Zawiadomienie")
                .content("Dn")
                .build();
        assertThrows(TransactionSystemException.class, () -> documentService.addDocument(documentDto));
    }
}
