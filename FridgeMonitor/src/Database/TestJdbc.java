package Database;

import java.sql.Connection;
import java.sql.DriverManager;

import FoodTypes.Store;
import FridgeMonitor.MainController;

public class TestJdbc {
	public static void main(String[] args) {
		String jdbcUrl="jdbc:mysql://localhost:3306/food?useSSL=false";
		String user="root";
		String password="0705";
		try {
			Connection myConn= DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("success");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}
}
