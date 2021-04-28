package skamila.udpj.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import skamila.udpj.document.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
}
