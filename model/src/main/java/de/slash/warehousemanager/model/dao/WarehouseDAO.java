package de.slash.warehousemanager.model.dao;

import de.slash.warehousemanager.model.EntityManagerHelper;
import de.slash.warehousemanager.model.entity.Warehouse;

import java.util.List;

public class WarehouseDAO implements IDAO<Warehouse>
{
    private EntityManagerHelper entityManagerHandler;

    public WarehouseDAO()
    {
        entityManagerHandler = EntityManagerHelper.getInstance();
    }

    @Override
    public List<Warehouse> getAll()
    {
        return entityManagerHandler.getEntities("SELECT w FROM Warehouse w");
    }

    @Override
    public void save(Warehouse warehouse)
    {
        entityManagerHandler.saveEntity(warehouse);
    }

    @Override
    public void update(Warehouse warehouse)
    {
        entityManagerHandler.deleteEntity(warehouse);
    }

    @Override
    public void delete(Warehouse warehouse)
    {
        entityManagerHandler.updateEntity(warehouse);
    }
}