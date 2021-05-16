package skamila.udpj.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import skamila.udpj.document.model.Addressee;

public interface AddresseeRepository extends JpaRepository<Addressee, Long> {
}
