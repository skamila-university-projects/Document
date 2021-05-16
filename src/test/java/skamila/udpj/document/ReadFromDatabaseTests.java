package skamila.udpj.document;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import skamila.udpj.document.dto.DocumentDto;
import skamila.udpj.document.dto.LetterDto;
import skamila.udpj.document.service.AddresseeService;
import skamila.udpj.document.service.DocumentService;
import skamila.udpj.document.service.LetterService;

@SpringBootTest
public class ReadFromDatabaseTests {

    @Autowired
    private DocumentService documentService;

    @Autowired
    private LetterService letterService;

    @Autowired
    AddresseeService addresseeService;

    @Test
    public void getDocument() {
        long id = 140;
        DocumentDto document = documentService.getDocument(id);
        StringBuilder tagsStringBuilder = new StringBuilder();
        document.getTags().forEach(tag -> tagsStringBuilder.append(tag).append(" "));
        System.out.println();
        System.out.println("Tytuł: " + document.getTitle());
        System.out.println("Treść: " + document.getContent());
        System.out.println("Tagi: " + tagsStringBuilder);
        System.out.println();
    }

    @Test
    public void getLetter() {
        long id = 144;
        LetterDto letter = letterService.getLetter(id);
        System.out.println();
        System.out.println("Tytuł: " + letter.getTitle());
        System.out.println("Treść: " + letter.getContent());
        System.out.println("Adresat: " + letter.getAddressee());
        System.out.println();
    }

    @Test
    public void getAddressee() {
        long id = 139;
        String addressee = addresseeService.getAddressee(id);
        System.out.println();
        System.out.println(addressee);
        System.out.println();
    }
}
