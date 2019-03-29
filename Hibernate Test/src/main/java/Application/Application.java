package Application;

import entity.Address;
import entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Application {
    public static void main(String[] args) throws ParseException {
    
        int i;
        Author author = new Author();
        Address address = new Address();
        author.setFirstname("George");
        author.setLastname("Martin");
        author.setAge(59);
        address.setLocation("Noida");
        address.setState("UP");
        address.setStreetNumber(45);
        author.setAddress(address);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Calendar cal =  Calendar.getInstance();
        for(i = 0;i<4;i++) {
            Author author1 = new Author();
            Address address1 = new Address();
            author1.setFirstname("firstname" + i);
            author1.setLastname("lastname" + i);
            author1.setAge(36+i*3);
            address1.setStreetNumber(45+i*2);
            address1.setLocation("Location"+i);
            address1.setState("State"+i);
            author1.setAddress(address1);
            String dateInString = new java.text.SimpleDateFormat("EEEE, dd/MM/yyyy")
                    .format(cal.getTime());
            SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd/MM/yyyy");
            Date parsedDate = formatter.parse(dateInString);
            author1.setDob(parsedDate);
            session.beginTransaction();
            session.save(author1);
            session.getTransaction().commit();
        }
        if (isCreated(session, author)) {
            System.out.println(author + " is inserted successfully.");
        }
        read(session, 2);
        if (isDeleted(session, 2)) {
            System.out.println("Row with id " + 2 + " is deleted.");
        }
        if(isUpdated(session,5)) {
            System.out.println("Age of id 5 is updated to 61");
        }
        sessionFactory.close();
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
        session.delete(session.get(Author.class, id));
        session.getTransaction().commit();
        return true;
    }
    
    static boolean isUpdated(Session session, int id) {
        session.beginTransaction();
        Author author = session.get(Author.class,id);
        author.setAge(61);
        session.update(author);
        session.getTransaction().commit();
        return true;
    }
}
