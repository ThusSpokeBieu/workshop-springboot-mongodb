package com.gmess.workshopmongodb.dto;

import com.gmess.workshopmongodb.domain.User;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@Setter
@Getter
public class AuthorDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 3850106919120607563L;
    private String id;
    private String name;

    public AuthorDTO(User obj){
        this.id = obj.getId();
        this.name = obj.getName();
    }

}
