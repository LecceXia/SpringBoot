import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App4 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx =session.beginTransaction();

        Many1 u1 = new Many1();
        u1.setName("many1_1");

        Many1 u2 = new Many1();
        u2.setName("many1_2");

        Many2 r1 = new Many2();
        r1.setName("many2_1");

        Many2 r2 = new Many2();
        r2.setName("many2_2");

        u1.getMany2Set().add(r1);
        u2.getMany2Set().add(r2);

        r1.getMany1Set().add(u1);
        r2.getMany1Set().add(u2);

        session.save(u1);
        session.save(r1);
        session.save(u2);
        session.save(r2);




        tx.commit();
        session.close();
    }
}
