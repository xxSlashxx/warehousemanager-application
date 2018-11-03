package de.slash.warehousemanager.model;

import javax.persistence.*;
import java.util.List;

public class EntityManagerHelper
{
    private static EntityManagerHelper entityManagerHelper = null;
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private EntityTransaction entityTransaction;

    private EntityManagerHelper()
    {
        entityManagerFactory = Persistence.createEntityManagerFactory("warehousemanager-persistance-unit");
        entityManager = entityManagerFactory.createEntityManager();
        entityTransaction = entityManager.getTransaction();
    }

    public static EntityManagerHelper getInstance()
    {
        if (entityManagerHelper == null)
        {
            synchronized (EntityManagerHelper.class)
            {
                if (entityManagerHelper == null)
                {
                    entityManagerHelper = new EntityManagerHelper();
                }
            }
        }

        return entityManagerHelper;
    }

    private EntityManager getEntityManager()
    {
        return entityManager;
    }

    private void beginTransaction()
    {
        if (!entityTransaction.isActive())
        {
            entityTransaction.begin();
        }
    }

    private void commitTransaction()
    {
        entityTransaction.commit();
    }

    public void saveEntity(Object object)
    {
        entityManagerHelper.beginTransaction();
        entityManagerHelper.getEntityManager().persist(object);
        entityManagerHelper.commitTransaction();
    }

    public void updateEntity(Object object)
    {
        entityManagerHelper.beginTransaction();
        entityManagerHelper.getEntityManager().merge(object);
        entityManagerHelper.commitTransaction();
    }

    public void deleteEntity(Object object)
    {
        entityManagerHelper.beginTransaction();
        entityManagerHelper.getEntityManager().remove(object);
        entityManagerHelper.commitTransaction();
    }

    public List getEntities(String queryString)
    {
        Query query = entityManagerHelper.getEntityManager().createQuery(queryString);
        return query.getResultList();
    }

    public void shutdown()
    {
        entityManager.close();
        entityManagerFactory.close();
    }
}