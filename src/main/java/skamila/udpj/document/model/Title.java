package skamila.udpj.document.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

@Embeddable
public class Title {

    @NotBlank
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String title) {
        this.value = title;
    }
}
