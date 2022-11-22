package com.kajanthan.StudentSystem.service;

import com.kajanthan.StudentSystem.model.Student;
import com.kajanthan.StudentSystem.reposistory.StudentReposistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentReposistory studentReposistory;


    @Override
    public Student saveStudent(Student student) {
        return studentReposistory.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentReposistory.findAll();
    }
}
