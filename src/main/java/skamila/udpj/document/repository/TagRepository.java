package skamila.udpj.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import skamila.udpj.document.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
