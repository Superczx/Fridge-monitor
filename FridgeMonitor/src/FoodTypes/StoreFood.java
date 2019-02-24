package FoodTypes;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="StoreFood")
public class StoreFood extends Food{
	@Column(name="pos")
	private String pos;
	@Column(name="daysLeft")
	private int daysLeft;
	@Column(name="dateIn")
	private String dateIn;
	
	
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public int getDaysLeft() {
		return daysLeft;
	}
	public void setDaysLeft(int daysLeft) {
		this.daysLeft = daysLeft;
	}
	public String getDateIn() {
		return dateIn;
	}
	public void setDateIn(String dateIn) {
		this.dateIn = dateIn;
	}

	 
//	 public void setDateIn(boolean ifNow) {
//		 if (ifNow)
//		 {
//			 Date date=new Date();
//			 String strDateFormat=String.format("%tb %td, %tY", date);
//			dateIn=strDateFormat;
//		 }
//	 }
	

}
