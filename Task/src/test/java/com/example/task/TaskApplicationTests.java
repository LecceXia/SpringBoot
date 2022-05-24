package com.example.task;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import com.example.task.model.Student;
import com.example.task.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaskApplicationTests {

    @Autowired
    private StudentRepository repository;

    @Test
    public void testCreateStudent() {
        Student student = new Student();
        student.setId(1);
        student.setName("Vincent");
        student.setAge(20);

        repository.save(student);
        Student s = repository.findById(1).get();
        assertNotNull(s);
    }

}
