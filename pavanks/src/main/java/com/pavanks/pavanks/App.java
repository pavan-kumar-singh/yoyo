package com.pavanks.pavanks;

import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

	public class App
	{
	public static void main(String[] args) throws HibernateException
		{
			Configuration cfg=new Configuration();
			cfg.configure();
			SessionFactory factory=cfg.buildSessionFactory();
			teacher t = new teacher (113, "nishith","java");
			Session sess=factory.openSession();
			Transaction tx=(Transaction) sess.beginTransaction();
			sess.save(t);
			tx.commit();
			
		}
	}
