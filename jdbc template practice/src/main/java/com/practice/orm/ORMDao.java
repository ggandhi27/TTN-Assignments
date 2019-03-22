package com.practice.orm;

import com.mysql.cj.xdevapi.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ORMDao {

    @Autowired
    SessionFactory sessionFactory;
    
    void sessionFactoryDemo(){
        
        String sql = "SELECT COUNT(*) FROM user";
//        Query query = sessionFactory.openSession().createQuery(sql);
//        System.out.println(query.uniqueResult());
    }
}
