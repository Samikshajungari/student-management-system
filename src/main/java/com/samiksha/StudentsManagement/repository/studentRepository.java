package com.samiksha.StudentsManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samiksha.StudentsManagement.entity.Student;

@Repository
public interface studentRepository extends JpaRepository<Student, Integer> {

}
