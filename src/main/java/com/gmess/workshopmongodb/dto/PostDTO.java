package com.gmess.workshopmongodb.dto;

import com.gmess.workshopmongodb.domain.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
public class PostDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 7734398046293947938L;
    private String id;
    private Date date;
    private String title, body;
    private AuthorDTO author;

    private List<CommentDTO> comments = new ArrayList<>();

    public PostDTO(Post obj){
        this.id = obj.getId();
        this.date = obj.getDate();
        this.title = obj.getTitle();
        this.body = obj.getBody();
        this.author = obj.getAuthor();
        this.comments.addAll(obj.getComments());
    }
}
