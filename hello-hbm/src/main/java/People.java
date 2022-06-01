import javax.persistence.*;

@Table(name ="people")
@Entity
public class People {
    private int id;
    private String Name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
