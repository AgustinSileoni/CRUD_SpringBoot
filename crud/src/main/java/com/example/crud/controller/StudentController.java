package com.example.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.entity.Student;
import com.example.crud.service.StudentService;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    
    @GetMapping
    public List<Student> getAll(){
        return studentService.getStudents();
    }

    @GetMapping("/{student_id}")
    public Optional<Student> getById(@PathVariable("student_id") Long student_id){
        return studentService.getStudent(student_id);
    }
    
    @PostMapping
    public void saveUpdate(@RequestBody Student student){
        studentService.saveOrUpdate(student);
    }


    @DeleteMapping("/{student_id}")
    public void delete_id(@PathVariable("student_id") Long student_id){
        studentService.delete(student_id);
    }
}
