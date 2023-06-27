 package com.pavanks.many_to_many.many_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	trainer t1= new trainer();
    	trainer t2= new trainer();
    	trainer t3= new trainer();
    	trainer t4= new trainer();
    	
    	
    	List <trainer> tlist1 = new ArrayList<trainer>();
    	tlist1.add(t1);
    	tlist1.add(t2);
    	
    	List <trainer> tlist2 = new ArrayList<trainer>();
    	tlist2.add(t2);
    	
    	List <trainer> tlist3 = new ArrayList<trainer>();
    	tlist3.add(t1);
    	tlist3.add(t3);
    	
    	List <trainer> tlist4 = new ArrayList<trainer>();
    	tlist4.add(t3);
    	
    	List <trainer> tlist5 = new ArrayList<trainer>();
    	tlist5.add(t1);
    	tlist5.add(t4);
    	
    	List <trainer> tlist6 = new ArrayList<trainer>();
    	tlist6.add(t2);
    	tlist6.add(t4);
    	
    	
    	subject s1=new subject(101, "java", tlist1);
    	subject s2=new subject(102, "python", tlist2);
    	subject s3=new subject (103, "sql", tlist3);
    	subject s4=new subject (104, "web", tlist4);
    	subject s5=new subject (105, "apti", tlist5);
    	subject s6=new subject (106, "testing", tlist6);
    	
    	List<subject> slist1=new ArrayList<subject>();
    	slist1.add(s1);
    	slist1.add(s3);
    	slist1.add(s5);
    	
    	List<subject> slist2=new ArrayList<subject>();
    	slist2.add(s1);
    	slist2.add(s2);
    	slist2.add(s6);
    	
    	List<subject> slist3=new ArrayList<subject>();
    	slist3.add(s3);
    	slist3.add(s4);
  
    	
    	List<subject> slist4=new ArrayList<subject>();
    	slist4.add(s5);
    	slist4.add(s6);
    	
    	  	
    	t1.setT_id(1);
    	t1.setName("Punith sir");
    	t1.setSubject(slist1);
    	
    	t2.setT_id(2);
    	t2.setName("ayush sir");
    	t2.setSubject(slist2);
    	
    	t3.setT_id(3);
    	t3.setName("blessina sir");
    	t3.setSubject(slist3);
    	
    	t4.setT_id(4);
    	t4.setName("kushal sir");
    	t4.setSubject(slist4);
    	
    	
    	Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session sess=factory.openSession();
		Transaction tx=(Transaction) sess.beginTransaction();
		
		sess.save(s1);
		sess.save(s2);
		sess.save(s3);
		sess.save(s4);
		sess.save(s5);
		sess.save(s6);
		
		sess.save(t1);
		sess.save(t2); 
		sess.save(t3);
		sess.save(t4);
		
		tx.commit();
		
    }
}
