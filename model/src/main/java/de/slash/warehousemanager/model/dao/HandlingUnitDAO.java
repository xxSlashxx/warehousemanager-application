package de.slash.warehousemanager.model.dao;

import de.slash.warehousemanager.model.EntityManagerHelper;
import de.slash.warehousemanager.model.entity.HandlingUnit;

import java.util.List;

public class HandlingUnitDAO implements IDAO<HandlingUnit>
{
    private EntityManagerHelper entityManagerHandler;

    public HandlingUnitDAO()
    {
        entityManagerHandler = EntityManagerHelper.getInstance();
    }

    @Override
    public List<HandlingUnit> getAll()
    {
        return entityManagerHandler.getEntities("SELECT h FROM HandlingUnit h");
    }

    @Override
    public void save(HandlingUnit handlingUnit)
    {
        entityManagerHandler.saveEntity(handlingUnit);
    }

    @Override
    public void update(HandlingUnit handlingUnit)
    {
        entityManagerHandler.updateEntity(handlingUnit);
    }

    @Override
    public void delete(HandlingUnit handlingUnit)
    {
        entityManagerHandler.deleteEntity(handlingUnit);
    }
}