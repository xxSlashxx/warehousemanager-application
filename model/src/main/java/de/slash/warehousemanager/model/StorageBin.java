package de.slash.warehousemanager.model;

public class StorageBin
{
    private int id;

    private Long row;

    private Long stack;

    private Long level;

    public StorageBin(int id, Long row, Long stack, Long level)
    {
        this.id = id;
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