import java.util.Random;
public class P3 {

	public static void main(String[] args) {
		Random rand=new Random();
		int a;
		int b;
		int c;
		int count=0;
        a=rand.nextInt(100);
        b=rand.nextInt(100);
        c=rand.nextInt(100);
        Function(a,b,c,count);
	}
 public static void Function(int a,int b,int c,int count){
	 if(count==20){
		 return;
	 }
	 System.out.println("The answer "+(count+1)+" is "+(a*b*c));
	 Random rand=new Random();
	 a=rand.nextInt(100);
     b=rand.nextInt(100);
     c=rand.nextInt(100);
     count++;
     Function(a,b,c,count);
	 
	 
 }
}
