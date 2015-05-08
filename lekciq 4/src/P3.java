import java.util.Scanner;


public class P3 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter numbers for entering: ");
        long N=input.nextLong();
        
        long min=0;
        long max=0;
        long flag=1;
       
        for(long i=1;i<=N;i++){
        	

    		System.out.println("Enter number "+i +" :");
    		 long Num=input.nextLong();
            if(flag==1){
            	min=Num;
            	max=Num;
            	flag=0;
            }
            else{
            	if(Num>max){
            
            	max=Num;
            	}
            
            if(Num<min){
            	min=Num;
            }
            }
            
        }
        System.out.println("max is:"+max);
        System.out.println("min is:"+min);
        input.close();
	}

}
