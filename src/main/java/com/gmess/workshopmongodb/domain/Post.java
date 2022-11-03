package com.gmess.workshopmongodb.domain;

import com.gmess.workshopmongodb.dto.AuthorDTO;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@Document
public class Post implements Serializable {
    @Serial
    private static final long serialVersionUID = -6723610263245096434L;

    @Id
    private String id;
    private Date date;
    private String title, body;
    private AuthorDTO author;

    public Post(String id, Date date, String title, String body, AuthorDTO author){
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
    }
}
