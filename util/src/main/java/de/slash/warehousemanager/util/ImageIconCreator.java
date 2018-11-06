package de.slash.warehousemanager.util;

import javax.swing.*;
import java.net.URL;

public class ImageIconCreator
{
    public static ImageIcon createImageIcon(String path)
    {
        URL imageURL = ImageIconCreator.class.getResource(path);
        return new ImageIcon(imageURL);
    }
}