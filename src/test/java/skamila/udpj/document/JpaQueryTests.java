package skamila.udpj.document;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import skamila.udpj.document.repository.TagCustomRepository;

@SpringBootTest
public class JpaQueryTests {

    @Autowired
    private TagCustomRepository tagCustomRepository;

    @Test
    public void updateTag() {
        String oldTagName = "ważne";
        String newTagName = "bardzo ważne";
        tagCustomRepository.updateTag(oldTagName, newTagName);
    }

    @Test
    public void getTag() {
        int id = 143;
        System.out.println();
        System.out.println("Tag: " + tagCustomRepository.getTag(id));
        System.out.println();
    }

}
