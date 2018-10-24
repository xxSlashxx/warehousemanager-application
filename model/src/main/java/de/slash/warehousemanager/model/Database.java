package de.slash.warehousemanager.model;

import java.util.ArrayList;
import java.util.List;

public class Database
{
    private List<Warehouse> warehouseList;

    public Database()
    {
        warehouseList = new ArrayList<Warehouse>();
        warehouseList.add(new Warehouse(1, "warehouse1", "desc1"));
        warehouseList.add(new Warehouse(2, "warehouse2", "desc2"));
        warehouseList.add(new Warehouse(3, "warehouse3", "desc3"));
    }

    public List<Warehouse> getAllWarehouses()
    {
        return warehouseList;
    }
}