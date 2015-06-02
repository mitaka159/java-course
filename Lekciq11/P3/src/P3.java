import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class P3 {

	public static void main(String[] args) {
		Queue<String> first=new LinkedList<String>();
		Stack<Character>second=new Stack<Character>();
		Stack<Character>third=new Stack<Character>();
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter sentance:");
		String  mitko=input.nextLine();
		char[] rezult=mitko.toCharArray();
		
		int flag=0;
		for(int i=0;i<rezult.length;i++){
			
			if(flag==0){
				if(!Character.isDigit(rezult[i])){
				System.out.println("Wrong ");
				System.exit(0);
			}
				String k=Character.toString(rezult[i]);
				first.offer(k);
				
				flag=1;
				continue;
			}
			if(flag==1){
				if(Character.isDigit(rezult[i])){
					System.out.println("Wrong ");
					System.exit(0);
				}
				second.push(rezult[i]);
				flag=0;
				continue;
			}
			
		}
		while(!second.isEmpty()){
			third.push(second.pop());
		}
		while(!third.isEmpty()){
			
		     char c=third.pop();
		     if(c=='+'){
		    	 int k=Integer.parseInt(first.poll());
		    	 int p=Integer.parseInt(first.poll());
		    	 k=k+p;
		    	 String t =Integer.toString(k);
		    	 first.offer(t);
		     }
		     else{
		    	 
		    	 int k=Integer.parseInt(first.poll());
		    	 
		    	 int p=Integer.parseInt(first.poll());
		    	 
		    	 k=p-k;
		    	 String t =Integer.toString(k);
		    	 first.offer(t);
		     }
		}
         System.out.println("The rezult is:"+first.poll());
         input.close();
	}

}
