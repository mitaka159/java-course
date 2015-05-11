import java.util.Scanner;


public class P2 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		
		 System.out.println("Enter the size of the mass: ");
		 int size=input.nextInt();
		 int flag=0;
		 int[] mass=new int[size];
		 for(int i=0;i<size;i++){
			 if(flag==0){
				 mass[i]=1;
				flag=1;
				continue;
			 }
			 if(flag==1){
				 mass[i]=1;
				 flag=2;
				 continue;
			 }
			 if(flag==2){
				 mass[i]=mass[i-1]+mass[i-2];
			 }
		 }
		 for(int k=0;k<size;k++){
			 System.out.println("The number "+(k+1)+" is:"+mass[k]); 
		 }
input.close();
	}

}
