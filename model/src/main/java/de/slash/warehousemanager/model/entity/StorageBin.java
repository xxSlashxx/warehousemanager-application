package de.slash.warehousemanager.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "STORAGE_BINS")
public class StorageBin
{
    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private Long row;

    @Column
    private Long stack;

    @Column
    private Long level;

    public StorageBin()
    {
    }

    public StorageBin(Long row, Long stack, Long level)
    {
        this.row = row;
        this.stack = stack;
        this.level = level;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Long getRow()
    {
        return row;
    }

    public void setRow(Long row)
    {
        this.row = row;
    }

    public Long getStack()
    {
        return stack;
    }

    public void setStack(Long stack)
    {
        this.stack = stack;
    }

    public Long getLevel()
    {
        return level;
    }

    public void setLevel(Long level)
    {
        this.level = level;
    }
}