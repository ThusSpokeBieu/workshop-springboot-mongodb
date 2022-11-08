package com.gmess.workshopmongodb.domain;

import com.gmess.workshopmongodb.dto.AuthorDTO;
import com.gmess.workshopmongodb.dto.CommentDTO;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="post")
public class Post implements Serializable {
    @Serial
    private static final long serialVersionUID = -6723610263245096434L;

    @Id
    private String id;
    private Date date;
    private String title, body;
    private AuthorDTO author;
    private List<CommentDTO> comments;
}
