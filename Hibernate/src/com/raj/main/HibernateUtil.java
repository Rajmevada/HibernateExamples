package com.raj.main;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.raj.bean.StudentO2M;
import com.raj.bean.SubjectO2M;
import com.raj.bean.TestFetch;

public class HibernateUtil {

	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory==null){
			
			StandardServiceRegistryBuilder registryBuilder=new StandardServiceRegistryBuilder();
			
			Map<String, String> hibernateCfg=new HashMap<String,String>();
			hibernateCfg.put(Environment.DRIVER,"com.mysql.jdbc.Driver" );
			hibernateCfg.put(Environment.USER,"root" );
			hibernateCfg.put(Environment.PASS,"root" );
			hibernateCfg.put(Environment.SHOW_SQL, "true");
			hibernateCfg.put(Environment.URL,"jdbc:mysql://localhost:3306/hibernate" );
			hibernateCfg.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect" );
			hibernateCfg.put(Environment.HBM2DDL_AUTO, "update");
			
			registryBuilder.applySettings(hibernateCfg);
			
			serviceRegistry=registryBuilder.build();
			
			MetadataSources metadataSources=new MetadataSources(serviceRegistry);
			metadataSources.addAnnotatedClass(StudentO2M.class);
			metadataSources.addAnnotatedClass(SubjectO2M.class);
			metadataSources.addAnnotatedClass(TestFetch.class);
			
			
			Metadata metadata=metadataSources.getMetadataBuilder().build();
			
			sessionFactory=metadata.getSessionFactoryBuilder().build();
			
		}
		
		return sessionFactory;
	}
	
	
	
	
}