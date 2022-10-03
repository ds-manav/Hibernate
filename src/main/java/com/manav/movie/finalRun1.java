package com.manav.movie;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class finalRun1 extends Exception
{
    public static void main( String[] args )
    {
    	Session session = null;
    	try {
    		System.out.println("Starting conncetion");
    		Configuration con = new Configuration().configure("project_hibernate1.cfg.xml");
    		ServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("project_hibernate1.cfg.xml").build();
    		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
    		SessionFactory factory = meta.getSessionFactoryBuilder().build();
    		session = factory.openSession();
    		Transaction t = session.beginTransaction();
//    		MovieEntity me = new MovieEntity();
//    		me.setmovieId(1001); 
//    		me.setmovieName("ForestGump");
//    		me.setlanguage("English");
//    		me.setreleaseIn(1996);
//    		me.setrevenue(100.00);
    		DirectorEntity de = new DirectorEntity();
    		de.setdirectorId(101);
    		de.setdirectorname("RJ");
    		SimpleDateFormat d = new SimpleDateFormat("yyyy/mm/dd");
    		Date date = d.parse("2000/10/08");
    		de.setdirectorborn(date);
    		session.persist(de);
    		t.commit();
    		System.out.println("Transaction Done");
    		factory.close();
    		
    	}
    	catch (Exception e) {
			System.out.println(e);
		}
    	finally {
    		session.close();
    	}
    }
}
