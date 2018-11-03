package de.slash.warehousemanager.view.storagebin;

import de.slash.warehousemanager.model.entity.StorageBin;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class StorageBinTableModel extends AbstractTableModel
{
    private List<StorageBin> storageBinList;
    private String[] colNames = {"Id", "Row", "Stack", "Level"};

    public StorageBinTableModel()
    {
        storageBinList = new ArrayList<>();
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
        return storageBinList.size();
    }

    @Override
    public Object getValueAt(int row, int column)
    {
        StorageBin storageBin = storageBinList.get(row);

        switch (column)
        {
            case 0:
                return storageBin.getId();
            case 1:
                return storageBin.getRow();
            case 2:
                return storageBin.getStack();
            case 3:
                return storageBin.getLevel();
            default:
                return null;
        }
    }

    public void setStorageBins(List<StorageBin> storageBinList)
    {
        this.storageBinList = storageBinList;
    }

    public void updateTable()
    {
        fireTableDataChanged();
    }
}
