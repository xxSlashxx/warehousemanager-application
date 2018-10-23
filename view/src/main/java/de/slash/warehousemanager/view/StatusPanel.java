package de.slash.warehousemanager.view;

import de.slash.warehousemanager.util.ColorConstants;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class StatusPanel extends JPanel
{
    private JLabel statusField;
    private JLabel timeLabel;
    private TimerThread timer;

    public StatusPanel()
    {
        initializeClass();
        initializeVariables();
        constructLayout();
        startTimer();
    }

    private void initializeClass()
    {
        this.setBorder(new EmptyBorder(0, 0, 0, 10));
        this.setBackground(ColorConstants.AZURE_BLUE);
        this.statusField = new JLabel();
        this.timeLabel = new JLabel();
        this.timer = new TimerThread(timeLabel);
    }

    private void initializeVariables()
    {
        this.timeLabel.setForeground(Color.WHITE);
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