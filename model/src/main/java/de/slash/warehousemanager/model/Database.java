package de.slash.warehousemanager.model;

import java.util.ArrayList;
import java.util.List;

public class Database
{
    private List<Warehouse> warehouseList;

    public Database()
    {
        warehouseList = new ArrayList<Warehouse>();
        warehouseList.add(new Warehouse(1, "warehouse1", "desc1", 1));
        warehouseList.add(new Warehouse(2, "warehouse2", "desc2", 26));
        warehouseList.add(new Warehouse(3, "warehouse3", "desc3", 51));
        warehouseList.add(new Warehouse(4, "warehouse4", "desc4", 76));
        warehouseList.add(new Warehouse(5, "warehouse5", "desc5", 91));

    }

    public List<Warehouse> getAllWarehouses()
    {
        return warehouseList;
    }
}