import java.util.Scanner;


public class P2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter word for replacing:");
		String word=input.nextLine();
		String word1=word.toUpperCase();
		System.out.println("Enter text:");
		String text=input.nextLine();
		
		String rezult=text.replaceAll(word,word1);
		System.out.println(rezult);
		
   input.close();
	}

}
