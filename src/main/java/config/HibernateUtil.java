package config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;

	private static SessionFactory buildSessionFactory() {
		try {   	// Searching "hibernate.cfg.xml"
			String hiberCfgPath = "config/hibernate.cfg.xml";

		    Configuration configuration = new Configuration();
		    configuration.configure(hiberCfgPath);	
		    
		    serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
		            configuration.getProperties()).build();
		    
		    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		    return sessionFactory;
		    
		     
		} catch (Throwable ex) {	// Logging probably exception
			System.err.println("Failed to initialize SessionFactory." + ex);
			throw new ExceptionInInitializerError(ex);
		  }
	}
 
	public static SessionFactory getSessionFactory() {
		buildSessionFactory();
		return sessionFactory;
	}
 
}