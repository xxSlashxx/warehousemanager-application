package de.slash.warehousemanager.service;

import de.slash.warehousemanager.model.entity.Warehouse;
import de.slash.warehousemanager.model.dao.WarehouseDAO;

import java.util.List;

public class WarehouseService implements IService<Warehouse>
{
    private WarehouseDAO warehouseDAO;

    public WarehouseService()
    {
        warehouseDAO = new WarehouseDAO();
    }

    public void insertTestData()
    {
        insert(new Warehouse("warehouse1", "desc1", 1));
        insert(new Warehouse("warehouse2", "desc2", 26));
        insert(new Warehouse("warehouse3", "desc3", 51));
        insert(new Warehouse("warehouse4", "desc4", 76));
        insert(new Warehouse("warehouse5", "desc5", 91));
    }

    @Override
    public List<Warehouse> getAll()
    {
        return warehouseDAO.getAll();
    }

    @Override
    public void insert(Warehouse warehouse)
    {
        warehouseDAO.save(warehouse);
    }
}