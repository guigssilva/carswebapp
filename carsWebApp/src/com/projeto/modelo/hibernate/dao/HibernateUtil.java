package com.projeto.modelo.hibernate.dao;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.cfg.AnnotationConfiguration;
 
public class HibernateUtil {  

	private static SessionFactory factory;

	private static AnnotationConfiguration cfg;
	static {
		cfg = new AnnotationConfiguration();
		cfg.configure();
		factory = cfg.buildSessionFactory();
	}

	public static Session getSession() {
		return factory.openSession();
	}
	
	
}  
	
	