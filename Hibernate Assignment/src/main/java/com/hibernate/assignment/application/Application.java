package com.hibernate.assignment.application;

import com.hibernate.assignment.hibernateassignment.entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {
    public static void main(String[] args) {
        Author author = new Author();
        author.setFirstname("George");
        author.setLastname("Martin");
        author.setAge(59);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        if (isCreated(session, author)) {
            System.out.println(author + " is inserted successfully.");
        }
        read(session, 1);
        if(isDeleted(session,1)) {
            System.out.println("Row with id " + 1 + " is deleted.");
        }
    }
    
    static boolean isCreated(Session session, Author author) {
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        return true;
    }
    
    static void read(Session session, int id) {
        session.beginTransaction();
        Author author = session.get(Author.class, id);
        System.out.println(author);
        session.getTransaction().commit();
    }
    
    static boolean isDeleted(Session session, int id) {
        session.beginTransaction();
        session.delete(session.get(Author.class,id));
        session.getTransaction().commit();
        return true;
    }
}
