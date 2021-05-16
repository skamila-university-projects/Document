package skamila.udpj.document.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import skamila.udpj.document.dto.LetterDto;
import skamila.udpj.document.mapper.LetterMapper;
import skamila.udpj.document.model.Letter;
import skamila.udpj.document.repository.LetterRepository;

import java.util.Optional;

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

    @Override
    @Transactional
    public LetterDto getLetter(Long id) {
        Optional<Letter> addresseeOptional = letterRepository.findById(id);
        return addresseeOptional.map(LetterMapper::mapToDto).orElse(null);
    }
}
