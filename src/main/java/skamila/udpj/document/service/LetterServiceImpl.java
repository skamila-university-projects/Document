package skamila.udpj.document.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import skamila.udpj.document.repository.LetterRepository;

@Service("letterService")
public class LetterServiceImpl implements LetterService {

    private final LetterRepository letterRepository;

    @Autowired
    public LetterServiceImpl(LetterRepository letterRepository) {
        this.letterRepository = letterRepository;
    }
}
