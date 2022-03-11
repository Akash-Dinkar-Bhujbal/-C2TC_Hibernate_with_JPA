package com.tns.jpacrud.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Serializable: MarkerInterface-------->Empty : 0Methods 0Variable 
 * Serializable ======= Obj--->stream Of Bytes
 */
@Entity
@Table(name = "student")
public class Student implements Serializable {
//	serialVersionUID
	private static final long serialVersionUID = 1L;
//	studentId
	@Id
	private int studentId;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

//	name
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}