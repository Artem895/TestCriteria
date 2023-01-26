package com.mytest.service;

import com.mytest.entity.DataBaseEntity;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
public class MyCustomService {
    public String firstRequestByCriteria() {
        //.addAnnotatedClass(DataBaseEntity.class)
        Session session = new Configuration().configure().addAnnotatedClass(DataBaseEntity.class).buildSessionFactory().openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<DataBaseEntity> cr = cb.createQuery(DataBaseEntity.class);
        Root<DataBaseEntity> root = cr.from(DataBaseEntity.class);
        cr.select(root);
        Query<DataBaseEntity> query = session.createQuery(cr);
        List<DataBaseEntity> results = query.getResultList();
        results.forEach(System.out::println);
        return "success";
    }

}
