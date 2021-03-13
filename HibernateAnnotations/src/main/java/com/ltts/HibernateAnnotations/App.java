package com.ltts.HibernateAnnotations;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction();   
    	  // Configuration cfg = new Configuration();
          // cfg.configure("hibernate.cfg.xml");
         //SessionFactory factory = cfg.buildSessionFactory();
           //Session session = factory.openSession();
           //Transaction t = session.beginTransaction();
           Employee e = new Employee();
           e.setEmpID(102);
           e.setEmpName("Vinay");
           e.setEmpAddress("Blore");
        
           session.save(e);
           t.commit();
           factory.close();
           session.close();
    	
    	
        System.out.println( "Hello World!" );
    }
}
