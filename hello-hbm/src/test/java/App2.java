import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {

    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        if(sessionFactory!=null){
            System.out.println("Success");
        }
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("x");
        employee.setLastName("y");

        Order order= new Order();
        order.setId(10);
        order.setName("task1");
        order.setEmployee(employee);

        Order order2= new Order();
        order2.setId(11);
        order2.setName("task2");
        order2.setEmployee(employee);

        Session session = sessionFactory.openSession();

        session.persist(employee);
        session.persist(order2);
        session.persist(order);

        session.beginTransaction().commit();
        session.close();
    }
}