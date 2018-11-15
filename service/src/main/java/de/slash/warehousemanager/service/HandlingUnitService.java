package de.slash.warehousemanager.service;

import de.slash.warehousemanager.model.dao.HandlingUnitDAO;
import de.slash.warehousemanager.model.entity.HandlingUnit;

import java.util.List;

public class HandlingUnitService implements IService<HandlingUnit>
{
    private HandlingUnitDAO handlingUnitDAO;

    public HandlingUnitService()
    {
        handlingUnitDAO = new HandlingUnitDAO();
    }

    @Override
    public List<HandlingUnit> getAll()
    {
        return handlingUnitDAO.getAll();
    }

    @Override
    public void insert(HandlingUnit handlingUnit)
    {
        handlingUnitDAO.save(handlingUnit);
    }

    @Override
    public void delete(HandlingUnit handlingUnit)
    {
        handlingUnitDAO.delete(handlingUnit);
    }
}