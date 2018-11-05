package de.slash.warehousemanager.view.common;

import de.slash.warehousemanager.util.ColorConstants;
import org.jdesktop.swingx.JXTable;
import org.jdesktop.swingx.decorator.ColorHighlighter;
import org.jdesktop.swingx.decorator.HighlightPredicate;
import org.jdesktop.swingx.decorator.Highlighter;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.List;

public class ContentTable extends JXTable
{
    public ContentTable(TableModel tableModel)
    {
        super(tableModel);
        initializeClass();
        initializeTableHeader();
    }

    public ContentTable(TableModel tableModel, List<Highlighter> highlighters)
    {
        this(tableModel);

        for (Highlighter highlighter : highlighters)
        {
            addHighlighter(highlighter);
        }
    }

    private void initializeClass()
    {
        setColumnControlVisible(true);
        setSelectionBackground(ColorConstants.BLUE_LIGHT);
        setSelectionForeground(Color.BLACK);
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        HighlightPredicate.RowGroupHighlightPredicate predicate = new HighlightPredicate.RowGroupHighlightPredicate(1);
        addHighlighter(new ColorHighlighter(predicate, ColorConstants.GRAY_LIGHT, Color.BLACK));
    }

    private void initializeTableHeader()
    {
        JTableHeader header = getTableHeader();
        header.setOpaque(false);
        header.setBackground(ColorConstants.BLUE_VS);
        header.setForeground(Color.WHITE);
    }
}