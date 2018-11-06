package de.slash.warehousemanager.view.sidemenu;

import de.slash.warehousemanager.util.ColorConstants;
import de.slash.warehousemanager.util.ImageIconCreator;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SideMenuWarehousemanagerLabel extends JLabel
{
    public SideMenuWarehousemanagerLabel()
    {
        initializeClass();
    }

    private void initializeClass()
    {
        setOpaque(true);
        setBackground(ColorConstants.BLUE_VS);
        setForeground(Color.WHITE);
        setBorder(new EmptyBorder(10, 45, 10, 45));
        setHorizontalAlignment(CENTER);
        setIcon(new ImageIcon(ImageIconCreator.createImageIcon("/logo.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
    }
}