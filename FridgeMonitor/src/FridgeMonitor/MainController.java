package FridgeMonitor;

//public class MyApplication {
//
//}
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

import Database.inputData;
import FoodTypes.Food;
import FoodTypes.Schedual;
import FoodTypes.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
 
public class MainController implements Initializable {
 
//   @FXML
//   private Button myButton;
  

	@FXML
	   private AnchorPane PageOne;
	   @FXML
	   private AnchorPane PageTwo;
	   @FXML
	   private AnchorPane PageThree;
	   @FXML
	   private AnchorPane PageFour;
	   @FXML
	   private TextField StoreName;
	   @FXML
	   private TextField StorePos;
	   @FXML
	   private TextField StoreAmount;
	   @FXML
	   private TextField StoreUnit;
	   @FXML
	   private DatePicker StoreDateIn;
	   @FXML
	   private DatePicker StoreExpiredDate;
	   
//	   String DateIn;
//	   String ExpiredDate;
	   
	   @Override
	   public void initialize(URL location, ResourceBundle resources) {
	 
	       // TODO (don't really need to do anything here).
	      
	   }
	   public void changePage1(ActionEvent event) {
		   System.out.println("button1 clicked!");
		   PageOne.setVisible(true);
		   PageTwo.setVisible(false);
		   PageThree.setVisible(false);
		   PageFour.setVisible(false);
		  
	   }
	   public void changePage2(ActionEvent event) {
		   System.out.println("button2 clicked!");
		   PageOne.setVisible(false);
		   PageTwo.setVisible(true);
		   PageThree.setVisible(false);
		   PageFour.setVisible(false);
		  
	   }
	   public void changePage3(ActionEvent event) {
		   System.out.println("button3 clicked!");
		   PageOne.setVisible(false);
		   PageTwo.setVisible(false);
		   PageThree.setVisible(true);
		   PageFour.setVisible(false);
		  
	   }
	   public void changePage4(ActionEvent event) {
		   System.out.println("button4 clicked!");
		   PageOne.setVisible(false);
		   PageTwo.setVisible(false);
		   PageThree.setVisible(false);
		   PageFour.setVisible(true);
		  
	   }
	   public void inputStoreValue(ActionEvent event) {
		   inputData input=new inputData();
//		   DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
//		    DateIn=StoreDateIn.getValue().format(formatter);
//		    ExpiredDate=StoreExpiredDate.getValue().format(formatter);
		   input.inputData(this.StoreName.getText(),this.StorePos.getText(),Double.valueOf(this.StoreAmount.getText()),
				   			this.StoreUnit.getText(),this.StoreDateIn.getValue(),this.StoreExpiredDate.getValue());
		   
	   }
	   
  
}