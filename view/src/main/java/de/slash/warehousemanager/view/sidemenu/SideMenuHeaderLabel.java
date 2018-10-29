package de.slash.warehousemanager.view.sidemenu;

import de.slash.warehousemanager.util.StringConstants;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SideMenuHeaderLabel extends JLabel
{
    public SideMenuHeaderLabel(String text)
    {
        super(text);
        initializeClass();
    }

    private void initializeClass()
    {
        setFont(new Font(StringConstants.FONT_NAME, Font.BOLD, 14));
        setForeground(Color.WHITE);
        setBorder(new EmptyBorder(0, 15, 0, 0));
    }
}