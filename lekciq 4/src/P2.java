import java.util.Scanner;


public class P2 {

	public static void main(String[] args) {
		
Scanner input= new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter numbers for entering: ");
        long N=input.nextLong();
        
        for(int i=1;i<=N;i++){
        	if((i%3)!=0 || (i%7)!=0){
        		System.out.println(i);
        	}
        	
        }
        input.close();
	}

}
