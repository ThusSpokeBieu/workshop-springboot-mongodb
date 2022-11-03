package com.gmess.workshopmongodb.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Builder
@Data
@EqualsAndHashCode
@Document
public class Post implements Serializable {
    @Serial
    private static final long serialVersionUID = -6723610263245096434L;

    @Id
    private String id;
    private Date date;
    private String title, body;
    private User author;

    public Post(String id, Date date, String title, String body, User author){
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
    }
}