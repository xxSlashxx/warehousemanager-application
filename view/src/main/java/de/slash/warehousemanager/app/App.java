package de.slash.warehousemanager.app;

import de.slash.warehousemanager.view.MainFrame;

import javax.swing.*;

public class App
{
    public static void main(String[] args)
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e)
        {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainFrame();
            }
        });
    }
}