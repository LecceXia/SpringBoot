import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_many1")
public class Many1 {
    private int id;
    private String name;
    private Set<Many2> many2Set = new HashSet<>();

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

    @ManyToMany(targetEntity = Many2.class)
    @JoinTable(
            name = "midmidmid",
            joinColumns = @JoinColumn(name="id1"),
            inverseJoinColumns = @JoinColumn(name = "id2")
    )
    public Set<Many2> getMany2Set() {
        return many2Set;
    }

    public void setMany2Set(Set<Many2> many2Set) {
        this.many2Set = many2Set;
    }
}
