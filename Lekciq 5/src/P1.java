import java.util.Scanner;


public class P1 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		
		 System.out.println("Enter the size of the mass: ");
		 int size=input.nextInt();
		 
		 int[] mass=new int[size];
		 for(int k=0;k<size;k++){
			 System.out.println("Enter number: ");
			 mass[k]=input.nextInt();
		 }
		 int sum=0;
		 int flag=0;
		 for(int i=0;i<size;i++){
			 if(mass[i]%2==0){
				 if(flag==0){
					 sum=mass[i];
					 flag=1;
				 }
				 else{
					 sum+=mass[i];
				 }
			 }
		 }
		 
		 System.out.println("The sum is: "+sum);
		 input.close();
	}

}
