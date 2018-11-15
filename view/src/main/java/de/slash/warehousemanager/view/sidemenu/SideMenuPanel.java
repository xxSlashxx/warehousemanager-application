package de.slash.warehousemanager.view.sidemenu;

import de.slash.warehousemanager.util.ColorConstants;
import de.slash.warehousemanager.util.ImageIconCreator;
import de.slash.warehousemanager.util.StringConstants;
import de.slash.warehousemanager.view.common.ICallback;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SideMenuPanel extends JPanel
{
    private ICallback callback;

    public SideMenuPanel(ICallback callback)
    {
        this.callback = callback;

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
        add(new SideMenuWarehousemanagerLabel(), "wrap 15");
        add(new SideMenuHeaderLabel(StringConstants.SIDE_MENU_HEADER), "wrap 10");
        addButtons();
    }

    private void addButtons()
    {
        add(createButton(StringConstants.SIDE_MENU_WAREHOUSES, "/warehouse.png"), "wrap -1");
        add(createButton(StringConstants.SIDE_MENU_STORAGE_BINS, "/storage_bin.png"), "wrap -1");
        add(createButton(StringConstants.SIDE_MENU_HANDLING_UNITS, "/handling_unit.png"), "wrap -1");
    }

    private SideMenuButton createButton(final String text, String imageIconPath)
    {
        SideMenuButton sideMenuButton = new SideMenuButton(text, ImageIconCreator.createImageIcon(imageIconPath));
        sideMenuButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                callback.switchView(text);
            }
        });

        return sideMenuButton;
    }
}