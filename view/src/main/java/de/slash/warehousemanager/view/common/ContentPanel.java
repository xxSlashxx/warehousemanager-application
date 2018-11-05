package de.slash.warehousemanager.view.common;

import de.slash.warehousemanager.util.ColorConstants;
import de.slash.warehousemanager.view.main.ContentHeaderLabel;
import info.clearthought.layout.TableLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public abstract class ContentPanel<T> extends JPanel implements IContentPanel<T>, ActionListener
{
    private String contentTitle;
    public ContentTable contentTable;
    private JButton addButton;
    private JButton deleteButton;

    public ContentPanel(String contentTitle)
    {
        initializeVariables(contentTitle);
        initializeClass();
        constructLayout();
        addListener();
    }

    private void initializeVariables(String contentDescription)
    {
        this.contentTitle = contentDescription;
        addButton = new JButton(createImageIcon("/plus.png"));
        deleteButton = new JButton(createImageIcon("/minus.png"));
    }

    private void initializeClass()
    {
        setBackground(ColorConstants.GRAY_LIGHT);
    }

    private void constructLayout()
    {
        double size[][] = {
                {30, TableLayout.FILL, 20, 30}, //Columns
                {30, 30, 10, TableLayout.FILL, 20, 20, 20, 30} //Rows
        };

        setLayout(new TableLayout(size));
    }

    private void addListener()
    {
        addButton.addActionListener(this);
        deleteButton.addActionListener(this);
    }

    public void addComponents()
    {
        add(new ContentHeaderLabel(contentTitle), "1, 1");
        add(new JScrollPane(contentTable), "1, 3, 1, 6");
        add(deleteButton, "2, 5");
        add(addButton, "2, 6");
    }

    private ImageIcon createImageIcon(String path)
    {
        URL imageURL = getClass().getResource(path);
        return new ImageIcon(imageURL);
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource().equals(addButton))
        {
            showAddDialog();
        }
        else if (event.getSource().equals(deleteButton))
        {
            showDeleteDialog();
        }
    }
}