package skamila.udpj.document.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Tag {

    @Id
    private Long id;

    @Column(unique = true)
    @NotBlank
    private String tag;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
