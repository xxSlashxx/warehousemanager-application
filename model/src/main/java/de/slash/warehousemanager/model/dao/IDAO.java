package de.slash.warehousemanager.model.dao;

import java.util.List;

public interface IDAO<T>
{
    List<T> getAll();

    void save(T t);

    void update(T t);

    void delete(T t);
}
