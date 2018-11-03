package de.slash.warehousemanager.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "WAREHOUSE")
public class Warehouse
{
    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String description;

    @Column(name="capacity_utilization")
    private int capacityUtilization;

    public Warehouse()
    {
    }

    public Warehouse(String name, String description, int capacityUtilization)
    {
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