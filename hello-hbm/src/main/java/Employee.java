import java.util.Set;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private Set<Order> orderlist;

    public Set<Order> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(Set<Order> orderlist) {
        this.orderlist = orderlist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
