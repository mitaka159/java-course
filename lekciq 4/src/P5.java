import java.util.Scanner;


public class P5 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter number one: ");
        long N=input.nextLong();
        
       
		System.out.println("Enter number two: ");
        long K=input.nextLong();
        long factorielN=1;
        long factorielK=1;
        long factorielKN=1;
        for(int i=1;i<=N;i++){
        	factorielN*=i;
        	
        }
        
        for(int i=1;i<=K;i++){
        	factorielK*=i;
        	
        }
        
       
        for(int i=1;i<=(N-K);i++){
        	factorielKN*=i;
        	
        }
        
        long rezult=((factorielN*factorielK)/factorielKN);
        System.out.println(rezult);
        
        input.close();
	}

}
