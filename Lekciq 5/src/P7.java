import java.util.Scanner;


public class P7 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		
		 System.out.println("Enter the size of the mass: ");
		 int size=input.nextInt();
		 
		int[] mass=new int[size];
     for(int r=0;r<size;r++){
    	 System.out.println("Enter number "+(r+1)+" :");
    	 mass[r]=input.nextInt();
     }
     
     System.out.println("Enter number for searching: ");
	 int num=input.nextInt();
       
        int p;
        int k=0;
        for(int i=0;i<mass.length;i++){
        	if(i==(size-1)){
        		i=0;
        		if(k==mass.length-1){
        			break;
        		}
        		k++;
        	}
        	if(mass[i]>mass[i+1]){
        		p=mass[i];
        		mass[i]=mass[i+1];
        		mass[i+1]=p;
        	}
        	
        }

        int low=0;
        int max=size-1;
        int mid=(low+max)/2;
        for(int m=0;m<size;m++){
        	if(mass[mid]<num){
        		low=mid+1;
        		mid=(low+max)/2;
        	}
        	if(mass[mid]>num){
        		max=mid-1;
        		mid=(low+max)/2;
        	}
        	if(mass[mid]==num){
        		System.out.println("The index is " +mid);
        		break;
        	}
        }
        input.close();
	}

}
