package lekciq2;
import java.util.Scanner;
public class P3 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("We need Name|Familyname|Years|Gender|CitizenNumber|Telephone");
		
		System.out.println("Enter name:");
		String name=input.nextLine();

		System.out.println("Enter Family name:");
		String familyName=input.nextLine();
		
		System.out.println("Enter years:");
		int years = input.nextInt();
		
		input.nextLine();//chistene na buffera(ina4e prezkacha gender
		
		System.out.println("Enter gender:");
		String gender=input.nextLine();
		
		System.out.println("Enter Citizen Number:");
		long citNum=input.nextLong();
		
		System.out.println("Enter Telephone:");
		long phone=input.nextLong(); //moje da stane i s string !
		
		System.out.println("Person name is: " +name +" Family name is: " +familyName +" Years are:" +years +" Gender is: " +gender +" Citizen number is:" +citNum +" The phone is: " +phone);
		input.close();
	}

}
