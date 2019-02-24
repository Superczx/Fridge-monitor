package Database;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import FoodTypes.Food;
import FoodTypes.Store;
import FoodTypes.StoreFood;

public class inputData {
	public void inputData(String name,String pos, double amount, String unit,LocalDate DateIn, LocalDate ExpiredDate)
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
			
			//create
			System.out.println("Create");
			ArrayList<Food> food = new ArrayList<Food>();
			StoreFood s1=new StoreFood();
			s1.setName(name);
			s1.setPos(pos);
			s1.setAmount(amount);
			s1.setUnit(unit);
			   DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
			   String StoreDateIn=DateIn.format(formatter);
			s1.setDateIn(StoreDateIn);
//			LocalDate d1=LocalDate.parse(DateIn,DateTimeFormatter.ISO_LOCAL_DATE);
//			LocalDate d2=LocalDate.parse(ExpiredDate,DateTimeFormatter.ISO_LOCAL_DATE);
			Duration diff=Duration.between(DateIn.atStartOfDay(),ExpiredDate.atStartOfDay());
			long diffDays=diff.toDays();
			s1.setDaysLeft(diffDays);
			food.add(s1);
			//start transaction
			session.beginTransaction();
			//save 
			System.out.println("saving");
			for (Object x: food)
				session.save(x);
				
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
