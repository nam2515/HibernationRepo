package com.capgemini.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	         SessionFactory factory=new Configuration().configure().buildSessionFactory();
	         Session session=factory.openSession();
	         Transaction t=session.beginTransaction();
	         Employee e1=new Employee();    
	         e1.setInd(1 );
	         e1.setName("Naman");
	       session.save(e1);  
	       t.commit();  
	       System.out.println("successfully saved");    
	        factory.close();  
	        session.close();     
	}
}
