package com.miura.studentsystem.service;

import java.util.List;

import com.miura.studentsystem.model.Student;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public void deleteStudent(Student student);

    
}
