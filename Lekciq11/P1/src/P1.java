import java.util.Scanner;
import java.util.Stack;


public class P1 {

	public static void main(String[] args) {
		Stack<String>word=new Stack<String>();
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter sentance:");
		String mitko=input.nextLine();
		String[] ready=mitko.split(" ");
        for(int i=0;i<ready.length;i++){
        	word.push(ready[i]);
        }
        while(!word.isEmpty()){
        	System.out.print(word.pop());
        	System.out.print(" ");
        }
        input.close();
	}

}
