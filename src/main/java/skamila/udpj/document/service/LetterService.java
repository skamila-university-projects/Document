package skamila.udpj.document.service;

import skamila.udpj.document.dto.LetterDto;

public interface LetterService {

    void addLetter(LetterDto letterDto);

    LetterDto getLetter(Long id);

}
