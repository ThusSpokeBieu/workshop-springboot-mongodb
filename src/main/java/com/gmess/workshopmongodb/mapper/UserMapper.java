package com.gmess.workshopmongodb.mapper;

import com.gmess.workshopmongodb.domain.User;
import com.gmess.workshopmongodb.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO (User entity);
    User toEntity(UserDTO dto);
}