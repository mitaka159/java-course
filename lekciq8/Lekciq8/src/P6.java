import java.util.Scanner;


public class P6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter factoriel:");
		int number=input.nextInt();
		int count=0;
		int rezult=1;
		if(number==0){
			System.out.println("Error");
			System.exit(0);
		}
		rezult=Factoriel(number,count,rezult);
		System.out.println("The answer is :"+rezult);
       input.close();
	}
	
	public static int Factoriel(int number,int counter,int rezult){
		if(number==(counter+1)){
			return rezult*number;
		}
		rezult*=(counter+1);
		
		counter++;
		rezult=Factoriel(number,counter,rezult);
		return rezult;
	}

}
