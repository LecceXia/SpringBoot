package constructer;

public class Customer {
    private String name;
    private int age;

    public Customer(int age) {
        this.age = age;
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
