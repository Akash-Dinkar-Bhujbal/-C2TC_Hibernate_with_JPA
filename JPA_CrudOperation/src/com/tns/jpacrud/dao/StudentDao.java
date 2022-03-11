package com.tns.jpacrud.dao;

import com.tns.jpacrud.entities.Student;

public interface StudentDao {
//	All methods are byDefault Abstract
	
	Student getStudentById(int id);

	void addStudent(Student student);

	void removeStudent(Student student);

	void updateStudent(Student student);

	void commitTransaction();

	void beginTransaction();
}