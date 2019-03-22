package com.practice.orm;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ORMDao {

    @Autowired
    SessionFactory sessionFactory;
    
    public void sessionFactoryDemo(){
        
        String sql = "SELECT COUNT(*) FROM User";
        Query query = sessionFactory.openSession().createQuery(sql);
        System.out.println(query.uniqueResult());
    }
}
