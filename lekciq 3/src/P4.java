import java.util.Scanner;


public class P4 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter first wall: ");
		int a=input.nextInt();

		System.out.println("Enter second wall: ");
		int b=input.nextInt();
		
		System.out.println("Enter third wall: ");
		int c=input.nextInt();
		if((a < (b + c)) &&(b < (a + c)) && (c < (a + b)) ){
			System.out.println("Possible");
		}
		else{
			System.out.println("Impossible");
		}
		input.close();
	}

}
