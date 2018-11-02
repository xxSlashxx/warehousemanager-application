package de.slash.warehousemanager.service;

import de.slash.warehousemanager.model.Database;
import de.slash.warehousemanager.model.Warehouse;

import java.util.List;

public class WarehouseService implements IService<Warehouse>
{
    private Database database;

    public WarehouseService()
    {
        database = new Database();
    }

    @Override
    public List<Warehouse> getAll()
    {
        return database.getAllWarehouses();
    }
}