import java.util.Scanner;
public class P7 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("ax^2+bx+c");
		System.out.println("Enter a:");
		int a=input.nextInt();
        
        System.out.println("Enter b: ");
        int b=input.nextInt();
        
        System.out.println("Enter c: ");
        int c=input.nextInt();

        double deskr=(Math.pow(b, 2))-(4*a*c);
        if(deskr<0){
        	System.out.println("NO ANSWER");
        }
        if(deskr==0){
        	
        	double answer=((-b)/(2*a));
        	System.out.print("x1=x2="+answer);
        }
        if(deskr>0){
        	
        	double answer1=((-b)+(Math.sqrt(deskr)))/(2*a);
        	double answer2=((-b)-(Math.sqrt(deskr)))/(2*a);
        	System.out.println("x1="+answer1);
        	System.out.println("x2="+answer2);
        }
        input.close();
	}

}
