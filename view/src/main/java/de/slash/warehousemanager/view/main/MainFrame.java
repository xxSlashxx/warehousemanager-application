package de.slash.warehousemanager.view.main;

import de.slash.warehousemanager.util.NumberConstants;
import de.slash.warehousemanager.util.StringConstants;
import de.slash.warehousemanager.view.common.ContentCardPanel;
import de.slash.warehousemanager.view.common.ICallback;
import de.slash.warehousemanager.view.common.IContentPanel;
import de.slash.warehousemanager.view.sidemenu.SideMenuPanel;
import de.slash.warehousemanager.view.statusbar.StatusBarPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements ICallback
{
    private ContentCardPanel contentCardPanel;
    private StatusBarPanel statusPanel;
    private SideMenuPanel sideMenuPanel;

    public MainFrame()
    {
        super(StringConstants.APP_NAME);
        initializeClass();
        initializeVariables();
        addComponents();
        refreshTable();
    }

    private void initializeClass()
    {
        setSize(NumberConstants.APP_WINDOW_SIZE_WIDTH, NumberConstants.APP_WINDOW_SIZE_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new BorderLayout());
    }

    private void initializeVariables()
    {
        contentCardPanel = new ContentCardPanel();
        statusPanel = new StatusBarPanel();
        sideMenuPanel = new SideMenuPanel(this);
    }

    private void addComponents()
    {
        add(contentCardPanel, BorderLayout.CENTER);
        add(statusPanel, BorderLayout.SOUTH);
        add(sideMenuPanel, BorderLayout.WEST);
    }

    public void refreshTable()
    {
        IContentPanel contentPanel = contentCardPanel.getCurrentVisiblePanel();
        contentPanel.setTableModel(contentPanel.getService().getAll());
        contentPanel.updateTable();
    }

    @Override
    public void switchView(String viewName)
    {
        CardLayout cardLayout = (CardLayout) contentCardPanel.getLayout();
        cardLayout.show(contentCardPanel, viewName);
        refreshTable();
    }
}