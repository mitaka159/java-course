import java.util.ArrayList;
import java.util.Scanner;


public class P3 {

	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<String>();
        Scanner input=new Scanner(System.in,"UTF-8");
        System.out.println("Enter tekst:");
        String cat=input.nextLine();
         String[] decision=(cat.split(" "));
         
         for(int u=0;u<decision.length;u++){
        	if(decision[u].equals("2")||decision[u].equals("3")||decision[u].equals("4")||decision[u].equals("5")||decision[u].equals("6")||decision[u].equals("7")||decision[u].equals("8")||decision[u].equals("9")||decision[u].equals("10")||decision[u].equals("J")||decision[u].equals("Q")||decision[u].equals("K")||decision[u].equals("A")){
        		
        	
        	
        	 words.add(decision[u]);
        	 continue;
        	}
        	System.out.println("Error");
         }
        for(int i=0;i<words.size();i++){
       	 String compare=words.get(i);
       	 String compare2;
       	 int count=0;
       	 for(int p=0;p<words.size();p++){
       		 compare2=words.get(p);
       		 if(compare.equals(compare2)){
       			 if(p!=i) {
       				 words.remove(p);
       				 p--;
       			 }
       			 count++;
       		 }
       	 }
       	 if(count==2)System.out.println("Chift ");
       	if(count==3)System.out.println("Set ");
       	if(count==4)System.out.println("Kare ");
        }
         input.close();

	}

}
