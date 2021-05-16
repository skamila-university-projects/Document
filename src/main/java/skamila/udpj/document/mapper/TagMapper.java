package skamila.udpj.document.mapper;

import skamila.udpj.document.model.Tag;

import java.util.List;
import java.util.Optional;

public class TagMapper {

    public static String mapToDto(Tag entity) {
        return entity.getTag();
    }

    public static Tag mapToEntity(String dto, List<Tag> allTags) {
        Optional<Tag> tagOptional = allTags.stream().filter(tag -> tag.getTag().equals(dto)).findAny();
        return tagOptional.orElseGet(() -> new Tag(dto));
    }

}
