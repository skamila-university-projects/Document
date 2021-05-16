package skamila.udpj.document.mapper;

import skamila.udpj.document.dto.DocumentDto;
import skamila.udpj.document.model.Content;
import skamila.udpj.document.model.Document;
import skamila.udpj.document.model.Tag;
import skamila.udpj.document.model.Title;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DocumentMapper {

    public static DocumentDto mapToDto(Document entity) {
        return DocumentDto.builder()
                .title(entity.getTitle().getValue())
                .content(entity.getContent().getValue())
                .tags(entity.getTags().stream().map(TagMapper::mapToDto).collect(Collectors.toSet()))
                .build();
    }

    public static Document mapToEntity(DocumentDto dto, List<Tag> allTags) {
        Document document = new Document();
        document.setTitle(new Title(dto.getTitle()));
        document.setContent(new Content(dto.getContent()));
        Set<String> tagsName = dto.getTags();
        Set<Tag> tags = new HashSet<>();
        if (tagsName != null) {
            tags = dto.getTags()
                    .stream()
                    .map(tagName -> TagMapper.mapToEntity(tagName, allTags))
                    .collect(Collectors.toSet());
        }
        document.setTags(tags);
        return document;
    }

}
