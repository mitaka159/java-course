
public class P6 {

	public static void main(String[] args) {
		int[] mass={30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		int count=0;
		for(int i=mass.length-1;i>-1;i--){
			if(count==6){
				count=0;
			System.out.println();	
			}
			System.out.print(mass[i]+" ");
			count++;
		}

	}

}
