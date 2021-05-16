package skamila.udpj.document.service;

import skamila.udpj.document.dto.DocumentDto;

public interface DocumentService {

    void addDocument(DocumentDto documentDto);

    DocumentDto getDocument(Long id);

    void rollbackTest(DocumentDto documentDto1, DocumentDto documentDto2);
}
