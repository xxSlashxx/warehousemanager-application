package de.slash.warehousemanager.view.main;

import de.slash.warehousemanager.util.ColorConstants;
import de.slash.warehousemanager.util.StringConstants;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ContentHeaderLabel extends JLabel
{
    public ContentHeaderLabel(String text)
    {
        super(text);
        initializeClass();
    }

    private void initializeClass()
    {
        setFont(new Font(StringConstants.FONT_NAME, Font.BOLD, 25));
        setForeground(ColorConstants.BLUE_VS);
        setBorder(new EmptyBorder(10, 0, 10, 0));
    }
}