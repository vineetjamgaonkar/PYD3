package com.dao;

import java.util.List;
import javax.sql.DataSource;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.dto.Student;
import com.paydue.util.SessionUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

@Repository
public class StudentJDBCTemplate implements StudentJDBCTempleteinterface{
	
	private SessionUtil sessionUtil;	 
    public void setSessionUtil(SessionUtil sessionUtil)
    {
		this.sessionUtil = sessionUtil;
	}
	
	    public void add(Student student) {
	    //	Session session = sessionFactory.openSession();
	    //	Transaction tx = session.beginTransaction();
	    	Session session=sessionUtil.getSession();
	    	session.save(student);
	    //    tx.commit();
	    //    session.close();
	    }


	    public void remove(Integer id) {
	    	System.out.println("Inside Remove Method StudentJDBCTemplete class");
	    	//setSessionUtil(sessionUtil);
	    	Session session=sessionUtil.getSession();
	    	Student student = (Student) session.load(Student.class, id);
	    	System.out.println("Student Here"+student.getName()+"   "+student.getAge());
	    //	session.delete(student);
	        if (null != student) {
	        	//Session session = sessionFactory.openSession();
		    	//Transaction tx = session.beginTransaction();
	        	System.out.println("Inside dao StudentJDBCTemplete Class Here");
	        //	Session session=sessionUtil.getSession();
	        	System.out.println("Inside dao StudentJDBCTemplete Class Here 2");
	        	//Query q = session.createQuery("delete Entity where id =id");
	        	//q.executeUpdate();
	        	session.delete(student);
	            System.out.println("Inside dao StudentJDBCTemplete Class Here 3");
	          //  tx.commit();
		      //  session.close();
	        }

	    }
	}