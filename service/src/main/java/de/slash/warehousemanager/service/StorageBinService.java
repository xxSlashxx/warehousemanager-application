package de.slash.warehousemanager.service;

import de.slash.warehousemanager.model.dao.StorageBinDAO;
import de.slash.warehousemanager.model.entity.StorageBin;

import java.util.List;

public class StorageBinService implements IService<StorageBin>
{
    private StorageBinDAO storageBinDAO;

    public StorageBinService()
    {
        storageBinDAO = new StorageBinDAO();
    }

    public void insertTestData()
    {
        insert(new StorageBin(1L, 1L, 1L));
        insert(new StorageBin(1L, 2L, 1L));
        insert(new StorageBin(1L, 3L, 1L));
        insert(new StorageBin(2L, 2L, 3L));
        insert(new StorageBin(2L, 2L, 3L));
        insert(new StorageBin(2L, 2L, 3L));
    }

    @Override
    public List<StorageBin> getAll()
    {
        return storageBinDAO.getAll();
    }

    @Override
    public void insert(StorageBin storageBin)
    {
        storageBinDAO.save(storageBin);
    }
}