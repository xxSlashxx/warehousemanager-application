package de.slash.warehousemanager.service;

import de.slash.warehousemanager.model.Database;
import de.slash.warehousemanager.model.Warehouse;

import java.util.List;

public class WarehouseService
{
    private Database database;

    public WarehouseService()
    {
        this.database = new Database();
    }

    public List<Warehouse> getAllWarehouses()
    {
        return this.database.getAllWarehouses();
    }
}