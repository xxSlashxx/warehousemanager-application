package de.slash.warehousemanager.view.storagebin;

import de.slash.warehousemanager.model.entity.StorageBin;
import de.slash.warehousemanager.service.IService;
import de.slash.warehousemanager.service.StorageBinService;
import de.slash.warehousemanager.util.ColorConstants;
import de.slash.warehousemanager.util.StringConstants;
import de.slash.warehousemanager.view.common.ContentPanel;
import de.slash.warehousemanager.view.common.ContentTable;
import de.slash.warehousemanager.view.main.ContentHeaderLabel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.List;

public class StorageBinContentPanel extends ContentPanel<StorageBin>
{
    private ContentTable storageBinTable;
    private StorageBinTableModel storageBinTableModel;

    public StorageBinContentPanel()
    {
        initializeClass();
        initializeVariables();
        addComponents();
    }

    private void initializeClass()
    {
        setBackground(ColorConstants.GRAY_LIGHT);
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(0, 30, 30, 30));
    }

    private void initializeVariables()
    {
        storageBinTableModel = new StorageBinTableModel();
        storageBinTable = new ContentTable(storageBinTableModel);
    }

    private void addComponents()
    {
        add(new ContentHeaderLabel(StringConstants.SIDE_MENU_STORAGE_BINS), BorderLayout.NORTH);
        add(new JScrollPane(storageBinTable), BorderLayout.CENTER);
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
}
