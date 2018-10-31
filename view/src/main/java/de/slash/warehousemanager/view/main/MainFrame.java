package de.slash.warehousemanager.view.main;

import de.slash.warehousemanager.model.Warehouse;
import de.slash.warehousemanager.service.WarehouseService;
import de.slash.warehousemanager.util.NumberConstants;
import de.slash.warehousemanager.util.StringConstants;
import de.slash.warehousemanager.view.sidemenu.SideMenuPanel;
import de.slash.warehousemanager.view.statusbar.StatusBarPanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainFrame extends JFrame
{
    private ContentPanel tablePanel;
    private StatusBarPanel statusPanel;
    private SideMenuPanel sideMenuPanel;
    private WarehouseService warehouseService;

    public MainFrame()
    {
        super(StringConstants.APP_NAME);
        initializeClass();
        initializeVariables();
        constructFrameLayout();
        refreshTable();
    }

    private void initializeClass()
    {
        setSize(NumberConstants.APP_WINDOW_SIZE_WIDTH, NumberConstants.APP_WINDOW_SIZE_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeVariables()
    {
        tablePanel = new ContentPanel();
        statusPanel = new StatusBarPanel();
        sideMenuPanel = new SideMenuPanel();
        warehouseService = new WarehouseService();
    }

    private void constructFrameLayout()
    {
        setLayout(new BorderLayout());
        add(tablePanel, BorderLayout.CENTER);
        add(statusPanel, BorderLayout.SOUTH);
        add(sideMenuPanel, BorderLayout.WEST);
    }

    private void refreshTable()
    {
        List<Warehouse> warehouses = loadWarehouses();
        tablePanel.setTableModel(warehouses);
        tablePanel.updateTable();
    }

    private List<Warehouse> loadWarehouses()
    {
        return warehouseService.getAllWarehouses();
    }
}