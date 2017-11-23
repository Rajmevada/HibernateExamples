package com.raj.main;

import org.hibernate.Session;

import com.raj.bean.StudentO2M;
import com.raj.bean.SubjectO2M;

public class App {

	public static void main(String[] args) {
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		StudentO2M studentO2M=new StudentO2M(0, "Raj", "Abad");
		session.save(studentO2M);
		
		SubjectO2M subjectO2M=new SubjectO2M();
		subjectO2M.setId(0);
		subjectO2M.setSubName("chem");
		subjectO2M.setSubTeacher("DRS");
		subjectO2M.setStudentO2M(studentO2M);
		
		SubjectO2M subjectO2M2=new SubjectO2M(0, "Phy", "AC", studentO2M);
		
		
		studentO2M.getSubjectO2Ms().add(subjectO2M);
		studentO2M.getSubjectO2Ms().add(subjectO2M2);
		
		session.save(subjectO2M);
		session.save(subjectO2M2);
		
		
		session.getTransaction().commit();
		
	}
	
}
