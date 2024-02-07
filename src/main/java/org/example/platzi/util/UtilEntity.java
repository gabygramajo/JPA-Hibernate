package org.example.platzi.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilEntity {
    // EntityManagerFactory es quien funcionará como la puerta a la BD
    private static final EntityManagerFactory entetyManagerFactory = buildEntityManagerFactory();

    public static EntityManagerFactory buildEntityManagerFactory() {
        /*
        * Devuelve una entidad Manager Factory*/
        return Persistence.createEntityManagerFactory("myPersistenceUnit");
    }

    // EntityManager nos permitirá realizar las operaciones en la BD
    public static EntityManager getEntityManager() {
        return entetyManagerFactory.createEntityManager();
    }
}
