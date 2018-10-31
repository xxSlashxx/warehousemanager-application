package de.slash.warehousemanager.view.main;

import de.slash.warehousemanager.model.Warehouse;
import de.slash.warehousemanager.util.ColorConstants;
import de.slash.warehousemanager.view.common.ContentTable;
import de.slash.warehousemanager.view.warehouse.WarehouseTableModel;
import org.jdesktop.swingx.decorator.ColorHighlighter;
import org.jdesktop.swingx.decorator.Highlighter;
import org.jdesktop.swingx.decorator.PatternPredicate;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WarehouseContentPanel extends JPanel
{
    private ContentTable warehouseTable;
    private WarehouseTableModel warehouseTableModel;

    public WarehouseContentPanel()
    {
        initializeClass();
        initializeVariables();
        addComponents();
    }

    private void initializeClass()
    {
        setBackground(ColorConstants.GRAY_LIGHT);
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(0, 30, 30, 30));
    }

    private void initializeVariables()
    {
        warehouseTableModel = new WarehouseTableModel();
        warehouseTable = new ContentTable(warehouseTableModel, createHighlighters());
    }

    private void addComponents()
    {
        add(new ContentHeaderLabel("Warehouses"), BorderLayout.NORTH);
        add(new JScrollPane(warehouseTable), BorderLayout.CENTER);
    }

    public void setTableModel(List<Warehouse> warehouseList)
    {
        warehouseTableModel.setWarehouses(warehouseList);
    }

    public void updateTable()
    {
        warehouseTableModel.updateTable();
    }

    private List<Highlighter> createHighlighters()
    {
        List<Highlighter> highlighters = new ArrayList<>();
        highlighters.add(createHighlighter("^([0-9]|[1-4][0-9]|50)$", ColorConstants.GREEN));
        highlighters.add(createHighlighter("^([5-6][0-9]|70)$", ColorConstants.YELLOW));
        highlighters.add(createHighlighter("^([7-8][0-9]|90)$", ColorConstants.ORANGE));
        highlighters.add(createHighlighter("^([9][0-9]|100)$", ColorConstants.RED));

        return highlighters;
    }

    private Highlighter createHighlighter(String regex, Color background)
    {
        PatternPredicate predicate = new PatternPredicate(regex, 3, 3);
        return new ColorHighlighter(predicate, background, Color.BLACK, background, Color.BLACK);
    }
}