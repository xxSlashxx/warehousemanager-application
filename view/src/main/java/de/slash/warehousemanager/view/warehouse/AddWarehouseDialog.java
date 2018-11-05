package de.slash.warehousemanager.view.warehouse;

import de.slash.warehousemanager.model.entity.Warehouse;
import de.slash.warehousemanager.service.WarehouseService;
import de.slash.warehousemanager.util.NumberConstants;
import de.slash.warehousemanager.util.StringConstants;
import de.slash.warehousemanager.view.main.MainFrame;
import info.clearthought.layout.TableLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddWarehouseDialog extends JDialog implements ActionListener
{
    private JLabel nameLabel;
    private JLabel descriptionLabel;
    private JTextField nameField;
    private JTextField descriptionField;
    private JButton cancelButton;
    private JButton saveButton;
    private WarehouseService warehouseService;
    private MainFrame parentFrame;

    public AddWarehouseDialog(MainFrame parentFrame)
    {
        super(parentFrame, StringConstants.ADD_WAREHOUSE_DIALOG_TITLE, DEFAULT_MODALITY_TYPE);
        initializeVariables(parentFrame);
        initializeClass();
        constructLayout();
        addComponents();
        addListener();
    }

    private void initializeVariables(MainFrame parentFrame)
    {
        nameLabel = new JLabel(StringConstants.ADD_WAREHOUSE_DIALOG_NAME_LABEL);
        descriptionLabel = new JLabel(StringConstants.ADD_WAREHOUSE_DIALOG_DESCRIPTION_LABEL);
        nameField = new JTextField();
        descriptionField = new JTextField();
        cancelButton = new JButton(StringConstants.DIALOG_CANCEL);
        saveButton = new JButton(StringConstants.DIALOG_SAVE);
        warehouseService = new WarehouseService();
        this.parentFrame = parentFrame;
    }

    private void initializeClass()
    {
        setSize(NumberConstants.ADD_WAREHOUSE_DIALOG_SIZE_WIDTH, NumberConstants.ADD_WAREHOUSE_DIALOG_SIZE_HEIGHT);
        setLocationRelativeTo(parentFrame);
    }

    private void constructLayout()
    {
        double size[][] = {
                {20, 75, 10, TableLayout.FILL, 75, 10, 75, 20}, //Columns
                {TableLayout.FILL, 20, TableLayout.FILL, 20, TableLayout.FILL, 20, TableLayout.FILL} //Rows
        };

        setLayout(new TableLayout(size));
    }

    private void addComponents()
    {
        add(nameLabel, "1, 1");
        add(descriptionLabel, "1, 3");
        add(nameField, "3, 1, 6, 1");
        add(descriptionField, "3, 3, 6, 3");
        add(saveButton, "4, 5");
        add(cancelButton, "6, 5");
    }

    private void addListener()
    {
        cancelButton.addActionListener(this);
        saveButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource() == this.cancelButton)
        {
            setVisible(false);
        }
        else if (event.getSource() == this.saveButton)
        {
            String name = nameField.getText();
            String desc = descriptionField.getText();
            Warehouse warehouse = new Warehouse(name, desc);
            warehouseService.insert(warehouse);
            parentFrame.refreshTable();
            setVisible(false);
        }
    }
}