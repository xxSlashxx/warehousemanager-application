package de.slash.warehousemanager.model;

import java.util.ArrayList;
import java.util.List;

public class Database
{
    private List<Warehouse> warehouseList;
    private List<StorageBin> storageBinList;

    public Database()
    {
        createWarehouseList();
        createStorageBinList();
    }

    private void createWarehouseList()
    {
        warehouseList = new ArrayList<>();
        warehouseList.add(new Warehouse(1, "warehouse1", "desc1", 1));
        warehouseList.add(new Warehouse(2, "warehouse2", "desc2", 26));
        warehouseList.add(new Warehouse(3, "warehouse3", "desc3", 51));
        warehouseList.add(new Warehouse(4, "warehouse4", "desc4", 76));
        warehouseList.add(new Warehouse(5, "warehouse5", "desc5", 91));
    }

    private void createStorageBinList()
    {
        storageBinList = new ArrayList<>();
        storageBinList.add(new StorageBin(1, 1L, 1L, 1L));
        storageBinList.add(new StorageBin(2, 1L, 2L, 1L));
        storageBinList.add(new StorageBin(3, 1L, 3L, 1L));
        storageBinList.add(new StorageBin(4, 2L, 2L, 3L));
        storageBinList.add(new StorageBin(5, 2L, 2L, 3L));
        storageBinList.add(new StorageBin(6, 2L, 2L, 3L));
    }

    public List<Warehouse> getAllWarehouses()
    {
        return warehouseList;
    }

    public List<StorageBin> getAllStorageBins()
    {
        return storageBinList;
    }
}