package skamila.udpj.document.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class LetterDto extends DocumentDto {

    private String addressee;

}
