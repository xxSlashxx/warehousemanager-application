package de.slash.warehousemanager.view.storagebin;

import de.slash.warehousemanager.model.entity.StorageBin;
import de.slash.warehousemanager.service.IService;
import de.slash.warehousemanager.service.StorageBinService;
import de.slash.warehousemanager.util.StringConstants;
import de.slash.warehousemanager.view.common.ContentPanel;
import de.slash.warehousemanager.view.common.ContentTable;

import java.util.List;

public class StorageBinContentPanel extends ContentPanel<StorageBin>
{
    private StorageBinTableModel storageBinTableModel;

    public StorageBinContentPanel()
    {
        super(StringConstants.SIDE_MENU_STORAGE_BINS);
        initializeVariables();
        addComponents();
    }

    private void initializeVariables()
    {
        storageBinTableModel = new StorageBinTableModel();
        contentTable = new ContentTable(storageBinTableModel);
    }

    public void setTableModel(List<StorageBin> storageBinList)
    {
        storageBinTableModel.setStorageBins(storageBinList);
    }

    public void updateTable()
    {
        storageBinTableModel.updateTable();
    }

    @Override
    public IService getService()
    {
        return new StorageBinService();
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