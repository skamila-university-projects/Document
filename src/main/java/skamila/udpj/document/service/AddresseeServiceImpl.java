package skamila.udpj.document.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import skamila.udpj.document.model.Addressee;
import skamila.udpj.document.repository.AddresseeRepository;

@Service("addresseeService")
public class AddresseeServiceImpl implements AddresseeService {

    private final AddresseeRepository addresseeRepository;

    @Autowired
    public AddresseeServiceImpl(AddresseeRepository addresseeRepository) {
        this.addresseeRepository = addresseeRepository;
    }

    @Override
    @Transactional
    public void addAddressee(String addressee) {
        addresseeRepository.save(new Addressee(addressee));
    }

}
