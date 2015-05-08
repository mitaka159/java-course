import java.util.Scanner;


public class P4 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter number one: ");
        long N=input.nextLong();
        
       
		System.out.println("Enter number two: ");
        long K=input.nextLong();
        int factorielN=1;
        int factorielK=1;
        
       
        
        for(int i=1;i<=N;i++){
        	factorielN*=i;
        	
        }
        
        for(int i=1;i<=K;i++){
        	factorielK*=i;
        	
        }
        if(!(K>1 && N>K)){
        	System.out.println("Error Calculating");
        	System.exit(0);
        }
        else{
        	
        
        int rezult=factorielN/factorielK;
        System.out.println("Answer is: "+rezult);
        }
        input.close();
	}

}
