package com.juliomartins.project.generic.infrastructure.exceptions;

public class EntityValidationException extends RuntimeException{
    public EntityValidationException(String msg){
        super(msg);
    }
}
