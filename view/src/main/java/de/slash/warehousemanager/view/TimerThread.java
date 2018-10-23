package de.slash.warehousemanager.view;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimerThread extends Thread
{
    private boolean isRunning;
    private JLabel timeLabel;
    private SimpleDateFormat timeFormat;

    public TimerThread(JLabel timeLabel)
    {
        initializeVariables(timeLabel);
    }

    private void initializeVariables(JLabel timeLabel)
    {
        this.timeLabel = timeLabel;
        this.timeFormat = new SimpleDateFormat("hh:mm:ss");
        this.isRunning = true;
    }

    @Override
    public void run()
    {
        while (isRunning)
        {
            Calendar currentCalendar = Calendar.getInstance();
            Date currentTime = currentCalendar.getTime();
            timeLabel.setText(timeFormat.format(currentTime));

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public void setRunning(boolean isRunning)
    {
        this.isRunning = isRunning;
    }
}