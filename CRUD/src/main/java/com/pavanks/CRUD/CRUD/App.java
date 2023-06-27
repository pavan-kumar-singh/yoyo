package com.pavanks.CRUD.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	laptop l1= new laptop(111,"mac",80000);
    	laptop l2= new laptop(112,"hp",50000);
    	laptop l3= new laptop(113,"dell",60000);
    	laptop l4= new laptop(114,"lenovo",40000);
    	laptop l5= new laptop(115,"asus",70000);
    	
    	
    	Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session sess=factory.openSession();
		Transaction tx=(Transaction) sess.beginTransaction();
		
		sess.save(l1);
		sess.save(l2);
		sess.save(l3);
		sess.save(l4);
		sess.save(l5);
		
		tx.commit();
		System.out.print("hello pavan");
		System.out.print("hello pavan");	    
		System.out.print("hello pavan");
		System.out.print("hello pavan");
	    
		System.out.print("hello pavan");
    }
}
