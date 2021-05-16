package skamila.udpj.document.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import skamila.udpj.document.dto.DocumentDto;
import skamila.udpj.document.mapper.DocumentMapper;
import skamila.udpj.document.model.Document;
import skamila.udpj.document.repository.DocumentRepository;

import java.util.Optional;

@Service("documentService")
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documentRepository;

    @Autowired
    public DocumentServiceImpl(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public void addDocument(DocumentDto documentDto) {
        documentRepository.save(DocumentMapper.mapToEntity(documentDto));
    }

    @Override
    @Transactional
    public DocumentDto getDocument(Long id) {
        Optional<Document> addresseeOptional = documentRepository.findById(id);
        return addresseeOptional.map(DocumentMapper::mapToDto).orElse(null);
    }
}
