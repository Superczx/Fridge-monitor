package Database;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import FoodTypes.Food;
import FoodTypes.StoreFood;

public class outputData {
	public void outputData()
	{
		//create session factory
		SessionFactory factory=new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Food.class)
								.addAnnotatedClass(StoreFood.class)
//								.addAnnotatedClass(Store.class)
								.buildSessionFactory();
		//create session
		Session session =factory.getCurrentSession();
		
		
		try {
			
			StoreFood s1=new StoreFood();
			
			   

			//start transaction
			session.beginTransaction();
			//save 
//			System.out.println("reading");
//			for (Object x: food)
//				session.save(x);
			Query query = session.createQuery("storefood");
			List<StoreFood> store=query.list();
			for(StoreFood x : store) {
	            System.out.println(x.getName());
	        }
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done");
			
			
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
