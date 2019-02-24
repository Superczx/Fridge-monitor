package Database;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import FoodTypes.Food;
import FoodTypes.StoreFood;
import FoodTypes.Schedual;
public class test {
	public static void main(String[] args) {
		//create session factory
				SessionFactory factory=new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Schedual.class)
										.addAnnotatedClass(StoreFood.class)
										.buildSessionFactory();
				//create session
				Session session =factory.getCurrentSession();
				
				
				try {
					
					//create
					System.out.println("Create");
					ArrayList<Food> food = new ArrayList<Food>();
					Schedual s1=new Schedual();
					s1.setName("cabbage");
					s1.setAmount(5);
					s1.setUnit("gram");
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
