package de.slash.warehousemanager.model.dao;

import de.slash.warehousemanager.model.EntityManagerHelper;
import de.slash.warehousemanager.model.entity.StorageBin;

import java.util.List;

public class StorageBinDAO implements IDAO<StorageBin>
{
    private EntityManagerHelper entityManagerHandler;

    public StorageBinDAO()
    {
        entityManagerHandler = EntityManagerHelper.getInstance();
    }

    @Override
    public List<StorageBin> getAll()
    {
        return entityManagerHandler.getEntities("SELECT s FROM StorageBin s");
    }

    @Override
    public void save(StorageBin storageBin)
    {
        entityManagerHandler.saveEntity(storageBin);
    }

    @Override
    public void update(StorageBin storageBin)
    {
        entityManagerHandler.updateEntity(storageBin);
    }

    @Override
    public void delete(StorageBin storageBin)
    {
        entityManagerHandler.deleteEntity(storageBin);
    }
}