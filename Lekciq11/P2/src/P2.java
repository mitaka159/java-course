import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class P2 {

	public static void main(String[] args) {
		Queue<String> first=new LinkedList<String>();
		Queue<String> second=new LinkedList<String>();
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter sentance:");
		String mitko=input.nextLine();
		String[] rezult=mitko.split(" ");
		for(int i=0;i<rezult.length;i++){
			first.offer(rezult[i]);
		}
		while(!first.isEmpty()){
			String text=first.poll();
			if(text.length()>3){
				second.offer(text);
			}
		}
		while(!second.isEmpty()){
			System.out.print(second.poll());
			System.out.print(" ");
		}
                 input.close();
	}

}
