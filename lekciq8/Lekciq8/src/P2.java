import java.util.Scanner;


public class P2 {

	public static void main(String[] args) {
		String name;
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter name:");
		name=input.nextLine();
		Function(name);
		input.close();

	}
	public static void Function(String name){
		System.out.println("Greeting,"+name);
	}

}
