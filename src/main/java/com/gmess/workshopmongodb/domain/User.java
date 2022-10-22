package com.gmess.workshopmongodb.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;

@Builder
@Data
@EqualsAndHashCode
@Document(collection="user")
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 6792864458970109762L;
    @Id
    private String id;
    private String name, email;

    public static void main(String[] args) {
        User user = User.builder().name("Jim Green").email("jimgreen@email.com").build();
    }
}
