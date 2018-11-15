package de.slash.warehousemanager.view.handlingunit;

import de.slash.warehousemanager.model.entity.HandlingUnit;
import de.slash.warehousemanager.service.HandlingUnitService;
import de.slash.warehousemanager.service.IService;
import de.slash.warehousemanager.util.StringConstants;
import de.slash.warehousemanager.view.common.ContentPanel;
import de.slash.warehousemanager.view.common.ContentTable;

import java.util.List;

public class HandlingUnitContentPanel extends ContentPanel<HandlingUnit>
{
    private HandlingUnitTableModel handlingUnitTableModel;

    public HandlingUnitContentPanel()
    {
        super(StringConstants.SIDE_MENU_HANDLING_UNITS);
        initializeVariables();
        addComponents();
    }

    private void initializeVariables()
    {
        handlingUnitTableModel = new HandlingUnitTableModel();
        contentTable = new ContentTable(handlingUnitTableModel);
    }

    @Override
    public void setTableModel(List<HandlingUnit> handlingUnitList)
    {
        handlingUnitTableModel.setHandlingUnits(handlingUnitList);
    }

    @Override
    public void updateTable()
    {
        handlingUnitTableModel.updateTable();
    }

    @Override
    public IService<HandlingUnit> getService()
    {
        return new HandlingUnitService();
    }

    @Override
    public void showAddDialog()
    {
        //TODO
    }

    @Override
    public void showDeleteDialog()
    {
        //TODO
    }
}
