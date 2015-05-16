import java.util.Scanner;


public class Cats {

	public static void main(String[] args) {
     Scanner input=new Scanner(System.in,"UTF-8");
     String name;
     int years;
     Cat[] mass=new Cat[10];
     for(int i=0;i<10;i++){
    	 
    	 System.out.println("Enter name for cat:");
    	 name=input.nextLine();
    	 System.out.println("Enter years for cat:");
    	 years=input.nextInt();
    	 input.nextLine();
    	 mass[i]=new Cat(name,years);
     }
     for(int k=0;k<10;k++){
    	 mass[k].Say();
     }
input.close();
	}

}
