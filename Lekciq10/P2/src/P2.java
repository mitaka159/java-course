import java.util.ArrayList;
import java.util.Scanner;


public class P2 {

	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<String>();
        Scanner input=new Scanner(System.in,"UTF-8");
        System.out.println("Enter tekst:");
        String cat=input.nextLine();
        cat=cat.toLowerCase();
         String[] decision=(cat.split(" "));
         for(int u=0;u<decision.length;u++){
        	 words.add(decision[u]);
         }
        for(int i=0;i<words.size();i++){
       	 String compare=words.get(i);
       	 String compare2;
       	 int count=0;
       	 for(int p=0;p<words.size();p++){
       		 compare2=words.get(p);
       		 if(compare.equals(compare2)){
       			 if(p!=i) words.remove(p);
       			 count++;
       		 }
       	 }
       	 if(count==1)System.out.println(compare);
        }
         input.close();

	}

}
