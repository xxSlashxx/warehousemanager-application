package de.slash.warehousemanager.view.statusbar;

import de.slash.warehousemanager.util.ColorConstants;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class StatusBarPanel extends JPanel
{
    private JLabel statusField;
    private JLabel timeLabel;
    private TimerThread timer;

    public StatusBarPanel()
    {
        initializeClass();
        initializeVariables();
        constructLayout();
        startTimer();
    }

    private void initializeClass()
    {
        setBorder(new EmptyBorder(0, 0, 0, 10));
        setBackground(ColorConstants.BLUE_VS);
    }

    private void initializeVariables()
    {
        statusField = new JLabel();
        timeLabel = new JLabel();
        timer = new TimerThread(timeLabel);
        timeLabel.setForeground(Color.WHITE);
    }

    private void constructLayout()
    {
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        add(statusField);
        add(timeLabel);
    }

    private void startTimer()
    {
        this.timer.start();
    }

    public void stopTimer()
    {
        this.timer.setRunning(false);
    }
}