package lekciq2;
import java.util.Scanner;
public class P8 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter number:");
		int number=input.nextInt();
		
		boolean rezult1= 0==number%2;
		 System.out.println("Chisloto e chetno -> "+rezult1);
			
		input.close();
	}
}
