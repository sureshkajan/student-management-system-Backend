package com.kajanthan.StudentSystem.service;

import com.kajanthan.StudentSystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
