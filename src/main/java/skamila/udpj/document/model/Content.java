package skamila.udpj.document.model;

import javax.persistence.Embeddable;

@Embeddable
public class Content {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
