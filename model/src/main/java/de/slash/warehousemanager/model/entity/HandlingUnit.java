package de.slash.warehousemanager.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "HANDLING_UNITS")
public class HandlingUnit
{
    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String identificationNumber;

    @Column
    private String status;

    public HandlingUnit()
    {
    }

    public HandlingUnit(int id, String identificationNumber, String status)
    {
        this.id = id;
        this.identificationNumber = identificationNumber;
        this.status = status;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getIdentificationNumber()
    {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber)
    {
        this.identificationNumber = identificationNumber;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
}