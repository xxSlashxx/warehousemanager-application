package de.slash.warehousemanager.view.handlingunit;

import de.slash.warehousemanager.model.entity.HandlingUnit;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class HandlingUnitTableModel extends AbstractTableModel
{
    private List<HandlingUnit> handlingUnitList;
    private String[] colNames = {"Id", "Identification Number", "Status"};

    public HandlingUnitTableModel()
    {
        handlingUnitList = new ArrayList<>();
    }

    @Override
    public int getRowCount()
    {
        return handlingUnitList.size();
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
    public Object getValueAt(int row, int column)
    {
        HandlingUnit handlingUnit = handlingUnitList.get(row);

        switch (column)
        {
            case 0:
                return handlingUnit.getId();
            case 1:
                return handlingUnit.getIdentificationNumber();
            case 2:
                return handlingUnit.getStatus();
            default:
                return null;
        }
    }

    public void setHandlingUnits(List<HandlingUnit> handlingUnitList)
    {
        this.handlingUnitList = handlingUnitList;
    }

    public void updateTable()
    {
        fireTableDataChanged();
    }
}