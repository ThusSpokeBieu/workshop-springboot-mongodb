package com.gmess.workshopmongodb.dto;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;


@NoArgsConstructor
@Setter
@Getter
@Builder
@AllArgsConstructor
public class CommentDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 3225011165523609168L;
    private String text;
    private Date date;
    private AuthorDTO author;
}
