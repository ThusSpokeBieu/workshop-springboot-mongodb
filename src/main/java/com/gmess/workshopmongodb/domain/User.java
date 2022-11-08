package com.gmess.workshopmongodb.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="user")
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 6792864458970109762L;
    @Id
    private String id;
    private String name, email;
    @DBRef(lazy = true)
    private List<Post> posts;
}
