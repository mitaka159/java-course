import java.util.Scanner;


public class P9 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in ,"UTF-8");

		System.out.println("Enter size of massive: ");
		int size=input.nextInt();
		
		int[][] mass= new int[size][size];
		int r=1;
		for(int i=0;i<size;i++){
			for(int k=0;k<size;k++){
				mass[k][i]=r;
				r++;
			}
		}
		
		for(int m=0;m<size;m++){
			for(int f=0;f<size;f++){
				System.out.print(mass[m][f]+" ");
			}
			System.out.println();
		}
		input.close();

	}

}
