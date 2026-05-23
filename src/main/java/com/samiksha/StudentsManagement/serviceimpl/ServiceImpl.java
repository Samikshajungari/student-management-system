package com.samiksha.StudentsManagement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samiksha.StudentsManagement.entity.Student;
import com.samiksha.StudentsManagement.service.StudentService;

@Service
public class ServiceImpl implements StudentService{
  
	@Autowired
	com.samiksha.StudentsManagement.repository.studentRepository studentRepository; 
	@Override
	public List<Student> getAllStudents() {
		
		List<Student> list=studentRepository.findAll();
		return list;
	}
	
	@Override
	public Student saveStudent(Student student)
	{
		return studentRepository.save(student);
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
	    studentRepository.deleteById(id);
	}

}
