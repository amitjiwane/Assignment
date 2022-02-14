package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AppMain {
  
	public static void main(String[]args) {
		
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Employee e1=new Employee();
        e1.setName("Amit Jiwane");
        
        Laptop laptop=new Laptop();
        laptop.setCpu("INTEL");
        laptop.setHdd("500GB");
        laptop.setRam("8GB");
        
        e1.setLaptop(laptop);
         session.save(e1);
    
      

        transaction.commit();
        session.close();
        System.out.println("done Laptop");
	}
}
