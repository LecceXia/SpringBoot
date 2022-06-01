package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Internshipprogram {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private Object id;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Course")
    private String course;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Internshipprogram that = (Internshipprogram) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(course, that.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, course);
    }
}
