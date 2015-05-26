import java.util.Scanner;


public class P4 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter word for searching:");
		String word=input.nextLine();
		System.out.println("Enter text:");
		String text=input.nextLine();
		
       String[] answer=text.split("\\.");
       

		
      
       for(int k=0;k<answer.length;k++){
        	if(answer[k].contains(word)){
        		System.out.println(answer[k]);
       	}
        }
   input.close();
	}
}
