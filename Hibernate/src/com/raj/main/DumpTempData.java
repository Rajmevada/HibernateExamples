package com.raj.main;

import org.hibernate.Session;

import com.raj.bean.TestFetch;

public class DumpTempData {
	
	public static void main(String[] args) {
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		
		for(int i=0;i<100;i++){
			
			TestFetch fetch=new TestFetch(0, "Raj"+i, "Abad"+i);
			session.save(fetch);
		}
		
		session.getTransaction().commit();
		
	}

}
