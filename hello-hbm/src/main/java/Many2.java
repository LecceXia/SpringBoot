import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "t_many2")
public class Many2 {
    private int id;
    private String name;
    private Set<Many1> many1Set = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(targetEntity = Many1.class, mappedBy = "many2Set")
    public Set<Many1> getMany1Set() {
        return many1Set;
    }

    public void setMany1Set(Set<Many1> many1Set) {
        this.many1Set = many1Set;
    }
}
