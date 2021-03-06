package de.slash.warehousemanager.view.warehouse;

import de.slash.warehousemanager.model.entity.Warehouse;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class WarehouseTableModel extends AbstractTableModel
{
    private List<Warehouse> warehouseList;
    private String[] colNames = {"Id", "Name", "Description", "Capacity Utilization"};

    public WarehouseTableModel()
    {
        warehouseList = new ArrayList<>();
    }

    @Override
    public int getColumnCount()
    {
        return colNames.length;
    }

    @Override
    public String getColumnName(int column)
    {
        return colNames[column];
    }

    @Override
    public int getRowCount()
    {
        return warehouseList.size();
    }

    @Override
    public Object getValueAt(int row, int column)
    {
        Warehouse warehouse = warehouseList.get(row);

        switch (column)
        {
            case 0:
                return warehouse.getId();
            case 1:
                return warehouse.getName();
            case 2:
                return warehouse.getDescription();
            case 3:
                return warehouse.getCapacityUtilization();
            default:
                return null;
        }
    }

    public void setWarehouses(List<Warehouse> warehouseList)
    {
        this.warehouseList = warehouseList;
    }

    public List<Warehouse> getWarehouses()
    {
        return warehouseList;
    }

    public void updateTable()
    {
        fireTableDataChanged();
    }
}