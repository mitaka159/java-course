import java.util.Scanner;


public class P3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter word for searching:");
		String word=input.nextLine();
		System.out.println("Enter text:");
		String text=input.nextLine();
		int c=0;
		int count=0;
		int javaIndex=0;
		 for(;;c=1){
			 javaIndex = text.indexOf(word,javaIndex+c);
			 
			 if(javaIndex==-1){
				 break;
			 }
			 
			 count ++;
			 
		 }
		 System.out.println("The answer is "+count+" times!");
   input.close();
	}

}
