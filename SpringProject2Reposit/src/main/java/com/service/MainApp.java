package com.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//
import com.dao.StudentJDBCTemplate;
import com.dao.StudentJDBCTempleteinterface;
import com.dto.Student;

public class MainApp implements MainAppInterfate{

	//private Student student;
	@Autowired
	private StudentJDBCTempleteinterface stdJdbc;
	
  public void addRecord(Student student){
	 
	  stdJdbc.add(student);
	
  }
  public void DeleteRecord(Integer id){
	
	  System.out.println("Inside Service Code");
	  System.out.println("StudentJDBCTemplate stdJdbc-----------> "+"\t"+stdJdbc);
	  stdJdbc.remove(id);
	 
  }
}