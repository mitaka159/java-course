package lekciq2;
import java.util.Scanner;
public class P7 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter number:");
		int number=input.nextInt();
		
		boolean rezult1= 0==number%5;
		boolean rezult2= 0==number % 7;
		
	
		
		
		 System.out.println("The number can divide on 5->"+rezult1);
		
		 System.out.println("The number can devide on 7->" +rezult2); 
			
		input.close();
	}

}
