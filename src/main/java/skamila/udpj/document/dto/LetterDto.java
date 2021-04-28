package skamila.udpj.document.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class LetterDto extends DocumentDto {

    private String addressee;

}
