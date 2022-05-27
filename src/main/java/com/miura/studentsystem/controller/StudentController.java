package com.miura.studentsystem.controller;

import java.util.List;

import com.miura.studentsystem.model.Student;
import com.miura.studentsystem.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student is add";
        
    }
    

    @GetMapping("/studentslist")
        public List<Student> getAllStudents(){
            return studentService.getAllStudents();

        }
        
    
    
}
