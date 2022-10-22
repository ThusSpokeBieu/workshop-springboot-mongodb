package com.gmess.workshopmongodb.resource.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StandardError implements Serializable {
    @Serial
    private static final long serialVersionUID = -4858016592584623132L;
    private Long timestamp;
    private Integer status;
    private String error, message, path;

}
