package FridgeMonitor;

//public class MyApplication {
//
//}
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
 
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
  
}