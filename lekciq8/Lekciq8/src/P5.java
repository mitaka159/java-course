
public class P5 {

	public static void main(String[] args) {
		Integer count=10;
		String[] arr=new String[999];
		Recursion(count,arr);
		
	}

	public static void Recursion(Integer count,String[] arr){
		if(count==1000){
			return;
		}
		arr[count-10]=Integer.toString(count);
		if((arr[count-10].charAt(0))==(arr[count-10].charAt(arr[count-10].length()-1))){
			
			System.out.println(arr[count-10]);
		}
		count++;
		Recursion(count,arr);
	}
}
