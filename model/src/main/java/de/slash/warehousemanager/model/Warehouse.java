package de.slash.warehousemanager.model;

public class Warehouse
{
    private int id;

    private String name;

    private String description;

    private int capacityUtilization;

    public Warehouse(int id, String name, String description, int capacityUtilization)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.capacityUtilization = capacityUtilization;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getCapacityUtilization()
    {
        return capacityUtilization;
    }

    public void setCapacityUtilization(int capacityUtilization)
    {
        this.capacityUtilization = capacityUtilization;
    }
}