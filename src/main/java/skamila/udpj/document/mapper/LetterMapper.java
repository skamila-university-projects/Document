package skamila.udpj.document.mapper;

import skamila.udpj.document.dto.LetterDto;
import skamila.udpj.document.model.Addressee;
import skamila.udpj.document.model.Content;
import skamila.udpj.document.model.Letter;
import skamila.udpj.document.model.Title;

public class LetterMapper {

    public static LetterDto mapToDto(Letter entity) {
        return LetterDto.builder().title(entity.getTitle().getValue())
                .content(entity.getContent().getValue())
                .addressee(entity.getAddressee().getName()).build();
    }

    public static Letter mapToEntity(LetterDto dto) {
        Letter letter = new Letter();
        letter.setTitle(new Title(dto.getTitle()));
        letter.setContent(new Content(dto.getContent()));
        letter.setAddressee(new Addressee(dto.getAddressee()));
        return letter;
    }

}
