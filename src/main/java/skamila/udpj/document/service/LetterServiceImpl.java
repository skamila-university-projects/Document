package skamila.udpj.document.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import skamila.udpj.document.dto.LetterDto;
import skamila.udpj.document.mapper.LetterMapper;
import skamila.udpj.document.repository.LetterRepository;

@Service("letterService")
public class LetterServiceImpl implements LetterService {

    private final LetterRepository letterRepository;

    @Autowired
    public LetterServiceImpl(LetterRepository letterRepository) {
        this.letterRepository = letterRepository;
    }

    @Override
    @Transactional
    public void addLetter(LetterDto letterDto) {
        letterRepository.save(LetterMapper.mapToEntity(letterDto));
    }
}
