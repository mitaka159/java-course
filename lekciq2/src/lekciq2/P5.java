package lekciq2;
import java.util.Scanner;
public class P5 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter 1st number:");
		int a=input.nextInt();
		
		System.out.println("Enter 2cond number:");
		int b=input.nextInt();
		
		System.out.println("Enter 3rd number :");
		int c=input.nextInt();
		
		System.out.println("Enter 4th number: ");
		int d=input.nextInt();
		
		System.out.println("The sum is : " +(a+b+c+d));
		input.close();
	}

}
