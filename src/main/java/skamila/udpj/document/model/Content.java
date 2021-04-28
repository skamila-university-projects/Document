package skamila.udpj.document.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

@Embeddable
public class Content {

    @Size(min = 3)
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
