package de.slash.warehousemanager.view.sidemenu;

import de.slash.warehousemanager.util.ColorConstants;
import de.slash.warehousemanager.util.StringConstants;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SideMenuButton extends JButton implements ChangeListener
{
    public SideMenuButton(String text, ImageIcon icon)
    {
        super(text, icon);
        initializeClass();
        initializeBorder();
        addButtonChangeListener();
    }

    private void initializeClass()
    {
        setFont(new Font(StringConstants.FONT_NAME, Font.PLAIN, 12));
        setHorizontalAlignment(LEFT);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setOpaque(true);
        setBackground(null);
        setForeground(Color.WHITE);
        setPreferredSize(new Dimension(190, 25));
    }

    private void initializeBorder()
    {
        Border outsideBorder = BorderFactory.createLineBorder(ColorConstants.GRAY_DARK);
        Border insideBorder = BorderFactory.createEmptyBorder(0, 15, 0, 0);
        setBorder(BorderFactory.createCompoundBorder(outsideBorder, insideBorder));
    }

    private void addButtonChangeListener()
    {
        getModel().addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e)
    {
        ButtonModel model = (ButtonModel) e.getSource();

        if (model.isRollover())
        {
            setBackground(ColorConstants.BLUE_VS);
        }
        else
        {
            setBackground(null);
        }
    }
}