package com.pavanks.CRUD.CRUD;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session sess=factory.openSession();
		Transaction tx=(Transaction) sess.beginTransaction();
		
	List<laptop> lsitt = sess.createQuery("FROM laptop").getResultList();
	for(laptop o : lsitt) {
		System.out.println(o);
	}
	}

}
