package com.gmess.workshopmongodb.mapper;

import com.gmess.workshopmongodb.domain.Post;
import com.gmess.workshopmongodb.dto.PostDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostMapper {
    PostDTO toDTO(Post entity);
    Post toEntity(PostDTO dto);
}
