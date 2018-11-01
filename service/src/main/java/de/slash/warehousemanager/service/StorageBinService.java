package de.slash.warehousemanager.service;

import de.slash.warehousemanager.model.Database;
import de.slash.warehousemanager.model.StorageBin;

import java.util.List;

public class StorageBinService implements IService<StorageBin>
{
    private Database database;

    public StorageBinService()
    {
        database = new Database();
    }

    @Override
    public List<StorageBin> getAll()
    {
        return database.getAllStorageBins();
    }
}