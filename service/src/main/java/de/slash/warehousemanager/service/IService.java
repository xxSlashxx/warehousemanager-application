package de.slash.warehousemanager.service;

import java.util.List;

public interface IService<T>
{
    List<T> getAll();

    void insert(T t);
}