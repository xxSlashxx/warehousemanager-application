package de.slash.warehousemanager.view.warehouse;

import de.slash.warehousemanager.model.entity.Warehouse;
import de.slash.warehousemanager.service.IService;
import de.slash.warehousemanager.service.WarehouseService;
import de.slash.warehousemanager.util.ColorConstants;
import de.slash.warehousemanager.util.StringConstants;
import de.slash.warehousemanager.view.common.ContentPanel;
import de.slash.warehousemanager.view.common.ContentTable;
import de.slash.warehousemanager.view.main.MainFrame;
import org.jdesktop.swingx.decorator.ColorHighlighter;
import org.jdesktop.swingx.decorator.Highlighter;
import org.jdesktop.swingx.decorator.PatternPredicate;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WarehouseContentPanel extends ContentPanel<Warehouse>
{
    private WarehouseTableModel warehouseTableModel;

    public WarehouseContentPanel()
    {
        super(StringConstants.SIDE_MENU_WAREHOUSES);
        initializeVariables();
        addComponents();
    }

    private void initializeVariables()
    {
        warehouseTableModel = new WarehouseTableModel();
        contentTable = new ContentTable(warehouseTableModel, createHighlighters());
    }

    @Override
    public void setTableModel(List<Warehouse> warehouseList)
    {
        warehouseTableModel.setWarehouses(warehouseList);
    }

    @Override
    public void updateTable()
    {
        warehouseTableModel.updateTable();
    }

    @Override
    public IService getService()
    {
        return new WarehouseService();
    }

    @Override
    public void showAddDialog()
    {
        MainFrame frame = (MainFrame) SwingUtilities.getAncestorOfClass(MainFrame.class, this);
        AddWarehouseDialog addWarehouseDialog = new AddWarehouseDialog(frame);
        addWarehouseDialog.setVisible(true);
    }

    @Override
    public void showDeleteDialog()
    {
        MainFrame frame = (MainFrame) SwingUtilities.getAncestorOfClass(MainFrame.class, this);
        Warehouse warehouse = warehouseTableModel.getWarehouses().get(contentTable.convertRowIndexToModel(contentTable.getSelectedRow()));

        int selectedOption = JOptionPane.showConfirmDialog(
                frame,
                String.format(StringConstants.DELETE_WAREHOUSE_DIALOG_MESSAGE, warehouse),
                StringConstants.DELETE_WAREHOUSE_DIALOG_TITLE,
                JOptionPane.YES_NO_OPTION);

        if (selectedOption == JOptionPane.YES_OPTION)
        {
            getService().delete(warehouse);
            frame.refreshTable();
        }
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