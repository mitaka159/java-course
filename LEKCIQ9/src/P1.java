import java.util.Scanner;


public class P1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter word:");
		String word=input.nextLine();
		int a=word.length();
		for(int k=a-1;k>=0;k--){
			System.out.print(word.charAt(k));
		}
        input.close();

	}

}
