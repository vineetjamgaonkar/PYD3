package com.dao;

import org.hibernate.Session;

import com.dto.Student;

public interface StudentJDBCTempleteinterface {

	 public void add(Student student);
	public void remove(Integer id);
	
}
