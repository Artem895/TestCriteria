package com.mytest.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    static SessionFactory sessionFactory = null;

//    static {
//        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
//                .configure("resources/hibernate.cfg.xml").build();
//        Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
//        sessionFactory = metadata.getSessionFactoryBuilder().build();
//    }

    public static SessionFactory getSessionFactory(){
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                .configure().build();
        Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        sessionFactory = metadata.getSessionFactoryBuilder().build();
        return sessionFactory;
    }

    public static void main() {

    }
}
