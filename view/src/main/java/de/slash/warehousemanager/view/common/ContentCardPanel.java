package de.slash.warehousemanager.view.common;

import de.slash.warehousemanager.util.StringConstants;
import de.slash.warehousemanager.view.storagebin.StorageBinContentPanel;
import de.slash.warehousemanager.view.warehouse.WarehouseContentPanel;

import javax.swing.*;
import java.awt.*;

public class ContentCardPanel extends JPanel
{
    public ContentCardPanel()
    {
        setLayout(new CardLayout());
        addCards();
    }

    private void addCards()
    {
        add(new WarehouseContentPanel(), StringConstants.SIDE_MENU_WAREHOUSES);
        add(new StorageBinContentPanel(), StringConstants.SIDE_MENU_STORAGE_BINS);
    }

    public IContentPanel getCurrentVisiblePanel()
    {
        for (Component comp : this.getComponents())
        {
            if (comp.isVisible())
            {
                return (IContentPanel) comp;
            }
        }

        return null;
    }
}