package lekciq2;
import java.util.Scanner;
public class P6 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter radius:");
		int radius=input.nextInt();
		
		double per=(double)2*3.14*radius;
		System.out.println("The perimeter is :"+per);
		
		double area=(double)3.14*radius*radius;
		System.out.println("The area is :"+area);
		input.close();
	}

}
