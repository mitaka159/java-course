import java.util.Scanner;


public class P5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter:");
		String text=input.nextLine();
       int k=text.length();
       int count1=0;
       int count2=0;
       for(int f=0;f<k;f++){
    	   if(text.charAt(f)=='('){
    		   count1++;
    	   }
    	   if(text.charAt(f)==')'){
    		   count2++;
    	   }
       }
       if(count1==count2){
    	   System.out.println(text+" -true");
       }
       else{
    	   System.out.println(text+" -false");
       }
       input.close();
	}

}
