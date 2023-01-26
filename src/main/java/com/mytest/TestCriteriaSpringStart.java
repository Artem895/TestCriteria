package com.mytest;

import com.mytest.entity.DataBaseEntity;
import com.mytest.service.MyCustomService;
import com.mytest.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@SpringBootApplication
public class TestCriteriaSpringStart implements CommandLineRunner {
    @Autowired
    private MyCustomService myCustomService;


    public static void main(String[] args) {
        SpringApplication.run(TestCriteriaSpringStart.class);
    }

    @Override
    public void run(String... args) throws Exception {
        myCustomService.firstRequestByCriteria();
    }
}
