package de.slash.warehousemanager.view.common;

import de.slash.warehousemanager.service.IService;

import java.util.List;

public interface IContentPanel<T>
{
    void setTableModel(List<T> t);

    void updateTable();

    IService getService();
}