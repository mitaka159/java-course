import java.util.Scanner;


public class P2 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter number one: ");
		int number1=input.nextInt();
        
        System.out.println("Enter number two: ");
        int number2=input.nextInt();
        
        System.out.println("Enter number three: ");
        int number3=input.nextInt();
int biggest=number1;
        
        if(biggest<number2){
        	biggest=number2;
        }
        if(biggest<number3){
        	biggest=number3;
        }
        System.out.println("The biggest number is:"+biggest);
        input.close();
	}

}
