package example.hibernate.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Movie;

public class HibernateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session hibernateSession = null;
		SessionFactory hibernateSessionFactory = null;
		Transaction hibernateTransaction = null;
		
		try {
			Configuration conf = new Configuration();
			//In the above statement, Hibernate looks for the file: hibernate.properties
			conf = conf.configure();//conf.configure("config.xml");
			//In the above statement, Hibernate looks for the file: hibernate.cfg.xml
			//Use conf.configure("-----"); if file name is other than hibernate.cfg.xml
			
			//Obtaining a SessionFactory
			hibernateSessionFactory = conf.buildSessionFactory();
			//Obtaining a Session
			hibernateSession = hibernateSessionFactory.openSession();
			//Creating an object of an entity class: Article
			LocalDate releaseonDate = LocalDate.of(2015, 12, 15);
			Movie m=new Movie(102,"Bahubali","S S Rajamouli","180min","releaseonDate");
			
			//Starting the transaction
			hibernateTransaction = hibernateSession.beginTransaction();
				//Persisting (Storing) the Article object as a record into Article_Master
				hibernateSession.save(m);
			//Committing the transaction
			hibernateTransaction.commit();
			//Closing the session
			hibernateSession.close();
			//Closing the session factory
		   hibernateSessionFactory.close();
			System.out.println("Record added");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}








