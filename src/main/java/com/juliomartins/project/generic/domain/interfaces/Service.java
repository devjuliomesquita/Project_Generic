package com.juliomartins.project.generic.domain.interfaces;

import com.juliomartins.project.generic.infrastructure.exceptions.EntityValidationException;

import java.io.Serializable;
import java.util.List;

public interface Service<Entity extends Serializable, TypeSequence extends java. lang.Number> {
    Entity getById(TypeSequence id);
    List<Entity> getAll();
    Entity save(Entity entity) throws EntityValidationException;
    Entity replace(Entity entity) throws EntityValidationException;
    void delete(TypeSequence id) throws EntityValidationException;

}
