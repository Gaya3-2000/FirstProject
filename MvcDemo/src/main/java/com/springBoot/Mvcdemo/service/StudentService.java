package com.springBoot.Mvcdemo.service;

import java.util.List;

import com.springBoot.Mvcdemo.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
    public Student saveStudent(Student student);
    
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    
    void deleteStudentById(Long id);
}
