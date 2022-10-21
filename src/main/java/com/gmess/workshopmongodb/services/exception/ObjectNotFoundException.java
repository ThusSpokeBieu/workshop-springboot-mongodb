package com.gmess.workshopmongodb.services.exception;

import java.io.Serial;

public class ObjectNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 7778992196345822159L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
