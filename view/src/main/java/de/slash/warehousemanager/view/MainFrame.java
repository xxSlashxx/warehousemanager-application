package de.slash.warehousemanager.view;

import de.slash.warehousemanager.NumberConstants;
import de.slash.warehousemanager.StringConstants;

import javax.swing.*;

public class MainFrame extends JFrame
{
    public MainFrame()
    {
        super(StringConstants.APP_NAME);
        constructAppWindow();
    }

    private void constructAppWindow()
    {
        setSize(NumberConstants.APP_WINDOW_SIZE_WIDTH, NumberConstants.APP_WINDOW_SIZE_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}