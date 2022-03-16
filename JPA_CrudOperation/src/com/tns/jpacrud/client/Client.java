package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client {
	public static void main(String[] args) {

		// Debug this program as Debug -> Debug as Java Application
//		Entity Object creation
		Student student = new Student();
//		Service Object creation for Operational part:CRUD Operation
		StudentService service = new StudentServiceImpl();

		/* Create Operation */

//		student.setStudentId(100);
//		student.setName("Sachin");
//		service.addStudent(student);

// at this breakpoint, we have added one record to table

//		student.setStudentId(105);//parameter access
//		student.setName("Vini");//parameter access
//		service.addStudent(student);//object create

		/* Retrieve Operation :SELECT */
//		student = service.findStudentById(105);
//		System.out.print("ID:" + student.getStudentId());
//		System.out.println(" Name:" + student.getName());

		/* Update Operation */
//		student = service.findStudentById(100);
//		student.setName("Sachin Tendulkar");
//		service.updateStudent(student);	

// at this breakpoint, we have updated record added in first section


		/* Delete Operation */
//		student = service.findStudentById(100);
//		service.removeStudent(student);
//		System.out.println("End of program/Life cycle completed...");
		
//		at this breakpoint, record is removed from table
		

	}
}