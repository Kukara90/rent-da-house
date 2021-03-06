package com.alexchern.rentahouse.service;

import java.util.List;

public interface BaseService<ENTITY> {

    ENTITY create(ENTITY entity);

    List<ENTITY> getAll();

    ENTITY getById(long entityId);

    void delete(long entityId);

    ENTITY update(long entityId, ENTITY entity);
}
