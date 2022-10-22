package com.gmess.workshopmongodb.dto;

import com.gmess.workshopmongodb.domain.User;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
public class UserDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1909797553118131099L;
    private String id;
    private String name, email;

    public UserDTO(User obj){
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

}
