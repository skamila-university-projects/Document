package skamila.udpj.document.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import skamila.udpj.document.dto.DocumentDto;
import skamila.udpj.document.mapper.DocumentMapper;
import skamila.udpj.document.model.Document;
import skamila.udpj.document.model.Tag;
import skamila.udpj.document.repository.DocumentRepository;
import skamila.udpj.document.repository.TagRepository;

import java.util.List;
import java.util.Optional;

@Service("documentService")
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documentRepository;
    private final TagRepository tagtRepository;

    @Autowired
    public DocumentServiceImpl(DocumentRepository documentRepository, TagRepository tagtRepository) {
        this.documentRepository = documentRepository;
        this.tagtRepository = tagtRepository;
    }

    @Override
    @Transactional
    public void addDocument(DocumentDto documentDto) {
        List<Tag> allTags = tagtRepository.findAll();
        documentRepository.save(DocumentMapper.mapToEntity(documentDto, allTags));
    }

    @Override
    @Transactional
    public DocumentDto getDocument(Long id) {
        Optional<Document> addresseeOptional = documentRepository.findById(id);
        return addresseeOptional.map(DocumentMapper::mapToDto).orElse(null);
    }
}
