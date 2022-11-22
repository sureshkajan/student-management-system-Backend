package com.kajanthan.StudentSystem.reposistory;

import com.kajanthan.StudentSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentReposistory extends JpaRepository<Student,Integer> {
}
