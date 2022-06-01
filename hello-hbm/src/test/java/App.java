import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        if(sessionFactory!=null){
            System.out.println("Success");
        }

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        People people = new People();
        people.setId(1);
        people.setName("xjn");

        session.save(people);


        tx.commit();
        session.close();
    }
}
