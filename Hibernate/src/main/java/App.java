import com.mysql.cj.Session;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.SessionFactory;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

public class App {
    public static void main(String[] args) {
        Alien alien = new Alien();
        alien.setAid(101);
        alien.setAname("xjn");
        alien.setColor("Blue");




    }
}
