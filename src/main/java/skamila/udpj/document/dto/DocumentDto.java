package skamila.udpj.document.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class DocumentDto {

    private String title;

    private String content;

}
