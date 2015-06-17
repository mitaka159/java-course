
import java.util.Calendar;
import java.util.Date;


public class Item {
	private String name;
	private double price;
	private Calendar date = Calendar.getInstance();
	private int day;
	Date dd;
	private int month;
	private int year;
	
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Item(String name, double price, Integer day, Integer month, Integer year) {
		super();
		this.name = name;
		this.price = price;
		
		
//		this.date=new Date(day,month,year);
		
		
	}


	public String getName() {
		return name;
	}

	public void setCalendar(int year,int  month, int day) {
		this.date.set(year, month-1, day);
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Date getDate() {
		dd=date.getTime();
		return dd;
	}


//	public void setDate(int day, int month , int year) {
//		
//		
//		
//	}


	public int getDay() {
		return day;
		
	}


	public void setDay(int day) {
		this.day = day;
		
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
}