import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class App3 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        Session session = null;
        SessionFactory sessionFactory = null;
        Transaction tx = null;
        try{

            sessionFactory = configuration.buildSessionFactory();
            session = sessionFactory.getCurrentSession();
            tx = session.beginTransaction();

            Query query =  session.createQuery("from Account order by id asc ");

//            query.setParameter(1,2);
//            query.setParameter(2,"xjn3");

            List<Account> list = query.list();

            for(Account account:list){
                System.out.println(account);
            }

            tx.commit();;

        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            session.close();
        }

//
//
//        Configuration configuration = new Configuration().configure();
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction tx = session.beginTransaction();
//
////        Course course1 = new Course();
////        course1.setId(101);
////        course1.setName("JAVA");
////
////        Course course2 = new Course();
////        course2.setId(102);
////        course2.setName("PYTHON");
////
////        Course course3 = new Course();
////        course3.setId(103);
////        course3.setName("HIBERNATE");
////
////        Account account1 = new Account();
////        account1.setId(1);
////        account1.setName("xjn1");
////
////        Account account2 = new Account();
////        account2.setId(2);
////        account2.setName("xjn2");
////
////        // set relationship
////
////        account1.getCourses().add(course1);
////        account1.getCourses().add(course2);
////
////        account2.getCourses().add(course2);
////        account2.getCourses().add(course3);
////
////        session.persist(account1);
////        session.persist(account2);
//
//        Account account = session.get(Account.class, 1);
//        session.delete(account);
//
//
//        tx.commit();
//        session.close();



    }
}
