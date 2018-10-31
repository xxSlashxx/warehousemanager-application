package de.slash.warehousemanager.view.sidemenu;

import de.slash.warehousemanager.util.ColorConstants;
import de.slash.warehousemanager.util.StringConstants;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.net.URL;

public class SideMenuPanel extends JPanel
{
    public SideMenuPanel()
    {
        initalizeClass();
        addComponents();
    }

    private void initalizeClass()
    {
        setBorder(new EmptyBorder(-7, -8, 0, -8));
        setBackground(ColorConstants.GRAY_DARK_LIGHTER);
        setLayout(new MigLayout(""));
    }

    private void addComponents()
    {
        add(new SideMenuWarehousemanagerLabel(StringConstants.APP_NAME), "wrap 15");
        add(new SideMenuHeaderLabel(StringConstants.SIDE_MENU_HEADER), "wrap 10");
        addButtons();
    }

    private void addButtons()
    {
        add(new SideMenuButton(StringConstants.SIDE_MENU_WAREHOUSES, createImageIcon("/warehouse.png")), "wrap -1");
        add(new SideMenuButton(StringConstants.SIDE_MENU_STORAGE_BINS, createImageIcon("/storage_bin.png")), "wrap -1");
        add(new SideMenuButton(StringConstants.SIDE_MENU_HANDLING_UNITS, createImageIcon("/handling_unit.png")), "wrap -1");
        add(new SideMenuButton(StringConstants.SIDE_MENU_ARTICLES, createImageIcon("/article.png")), "wrap -1");
        add(new SideMenuButton(StringConstants.SIDE_MENU_ORDERS, createImageIcon("/order.png")), "wrap -1");
        add(new SideMenuButton(StringConstants.SIDE_MENU_CUSTOMERS, createImageIcon("/customer.png")));
    }

    private ImageIcon createImageIcon(String path)
    {
        URL imageURL = getClass().getResource(path);
        return new ImageIcon(imageURL);
    }
}