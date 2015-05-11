import java.util.Scanner;


public class P8 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in ,"UTF-8");

		System.out.println("Enter size of massive: ");
		int size=input.nextInt();
		
		int[] mass= new int[size];
		
		for(int i=0;i<size;i++){
			System.out.println("Enter number "+(i+1));
			mass[i]=input.nextInt();
		}
		int p=0;
		for(int k=0;k<size;k++){
			for(int r=0;r<size;r++){
				if(r==size-1){
					continue;
				}
				if(mass[r]>mass[r+1]){
					p=mass[r+1];
					mass[r+1]=mass[r];
					mass[r]=p;
				}
			}
		}
		
		for(int m=0;m<size;m++){
			System.out.println(mass[m]);
		}
		input.close();
	}

}
