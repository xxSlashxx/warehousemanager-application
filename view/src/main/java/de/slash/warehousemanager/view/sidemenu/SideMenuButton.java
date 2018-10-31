package de.slash.warehousemanager.view.sidemenu;

import de.slash.warehousemanager.util.ColorConstants;
import de.slash.warehousemanager.util.StringConstants;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SideMenuButton extends JButton
{
    public SideMenuButton(String text, ImageIcon icon)
    {
        super(text, icon);
        initializeClass();
        initializeBorder();
        addButtonListener();
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

    private void addButtonListener()
    {
        getModel().addChangeListener(new SidePanelButtonChangeListener(this));
    }

    private class SidePanelButtonChangeListener implements ChangeListener
    {
        JButton button;

        private SidePanelButtonChangeListener(JButton button)
        {
            this.button = button;
        }

        @Override
        public void stateChanged(ChangeEvent e)
        {
            ButtonModel model = (ButtonModel) e.getSource();

            if (model.isRollover())
            {
                button.setBackground(ColorConstants.BLUE_VS);
            }
            else
            {
                button.setBackground(null);
            }
        }
    }
}