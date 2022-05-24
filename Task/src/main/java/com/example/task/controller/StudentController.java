package com.example.task.controller;

import com.example.task.model.Student;
import com.example.task.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @PostMapping(value="/student")
    public Student insertStudent(@RequestBody Student student){
        repository.save(student);
        return student;
    }
    @GetMapping(value="/students")
    public List<Student> viewAll(){
        return repository.findAll();
    }

    @DeleteMapping(value="/student/{studentid}")
    public void deleteStudent(@PathVariable("studentid") int id){
        repository.deleteById(id);
    }

    @PutMapping(value="/student")
    public Student updateStudent(@RequestBody Student student){
        repository.save(student);
        return student;
    }

}
