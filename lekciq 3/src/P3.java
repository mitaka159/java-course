import java.util.Scanner;


public class P3 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter number 0-9: ");
		char a=input.next().charAt(0);
		if(a=='0'){
			System.out.println("zero");
		}
		if(a=='1'){
			System.out.println("one");
		}
		if(a=='2'){
			System.out.println("two");
		}
		if(a=='3'){
			System.out.println("three");
		}
		if(a=='4'){
			System.out.println("four");
		}
		if(a=='5'){
			System.out.println("five");
		}
		if(a=='6'){
			System.out.println("six");
		}
		if(a=='7'){
			System.out.println("seven");
		}
		if(a=='8'){
			System.out.println("eight");
		}
		if(a=='9'){
			System.out.println("nine");
		}
     input.close();
	}

}
