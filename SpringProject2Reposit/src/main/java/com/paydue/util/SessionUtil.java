package com.paydue.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
	
	private  static SessionFactory sessionFactory;
	 
	
    public  void  setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    
    public  Session getSession()
    {
    	System.out.println("get method Inside Session");
    	System.out.println("here"+"+++++++++++++++++++"+sessionFactory);
    	//setSessionFactory(sessionFactory);
    	Session session = sessionFactory.openSession();
        return session;
    }

	public static void shutdown() 
	{
		
	}
}


