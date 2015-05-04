import java.util.Scanner;


public class P1 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter number one: ");
		int number1=input.nextInt();
        
        System.out.println("Enter number two: ");
        int number2=input.nextInt();
        
        if((number1>0 && number2>0)||(number1<0 && number2<0)){
        	System.out.println("Answer is: +");
        }
        if((number1<0 && number2>0)||(number1>0 && number2<0)){
        	System.out.println("Answer is: -");
        }
        input.close();

	}

}
