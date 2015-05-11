import java.util.Scanner;


public class P4 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		
		 System.out.println("Enter the number for searching: ");
		 int num=input.nextInt();
		  int[] mass={5,10,15,20,34,35,36,3,2,16,32,1,4,5,7,6,9,8,11,15,14,13,17,18,22};
		  int flag=0;
		  for(int i=0;i<mass.length;i++){
			  if(mass[i]==num){
				  System.out.println("The index is: "+i);
				  flag=1;
				  break;
			  }
		  }
		  if(flag==0){
			  System.out.println("There is no such number in the massive");  
		  }
input.close();
	}

}
