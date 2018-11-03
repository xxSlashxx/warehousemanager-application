package de.slash.warehousemanager.app;

import de.slash.warehousemanager.service.StorageBinService;
import de.slash.warehousemanager.service.WarehouseService;
import de.slash.warehousemanager.view.main.MainFrame;

import javax.swing.*;

public class App
{
    public static void main(String[] args)
    {
        WarehouseService service = new WarehouseService();
        service.insertTestData();
        StorageBinService service1 = new StorageBinService();
        service1.insertTestData();

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