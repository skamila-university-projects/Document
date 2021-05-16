package skamila.udpj.document.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

@Embeddable
public class Title {

    @NotBlank
    @Column(name = "title")
    private String value;

    public Title() {

    }

    public Title(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String title) {
        this.value = title;
    }
}
