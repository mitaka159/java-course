import java.util.Scanner;


public class PClass {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter sentance:");
		String line=input.nextLine();
		if(line.startsWith("Greeting")){
			System.out.println("Starts with greeting true");
		}
		else{
			System.out.println("Starts with greeting false");
		}
		if(line.endsWith(".")){
			System.out.println("Ends with dot true");
		}
		else{
			System.out.println("Ends with dot false");
		}
		if(line.contains("water")){
			System.out.println("Contains water true");
		}
		else{
			System.out.println("Contains water false");
		}
		input.close();

	}

}
