package skamila.udpj.document.mapper;

import skamila.udpj.document.dto.DocumentDto;
import skamila.udpj.document.model.Content;
import skamila.udpj.document.model.Document;
import skamila.udpj.document.model.Tag;
import skamila.udpj.document.model.Title;

import java.util.stream.Collectors;

public class DocumentMapper {

    public static DocumentDto mapToDto(Document entity) {
        return DocumentDto.builder()
                .title(entity.getTitle().getValue())
                .content(entity.getContent().getValue())
                .tags(entity.getTags().stream().map(Tag::getTag).collect(Collectors.toSet()))
                .build();
    }

    public static Document mapToEntity(DocumentDto dto) {
        Document document = new Document();
        document.setTitle(new Title(dto.getTitle()));
        document.setContent(new Content(dto.getContent()));
        document.setTags(dto.getTags().stream().map(Tag::new).collect(Collectors.toSet()));
        return document;
    }

}
