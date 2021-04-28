package skamila.udpj.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import skamila.udpj.document.model.Letter;

@Repository
public interface LetterRepository extends JpaRepository<Letter, Long> {
}
