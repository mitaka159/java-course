import java.util.Scanner;
public class Store extends Stock {
	Scanner input = new Scanner (System.in ,"UTF-8");
   public static int counter=0;
	String name;
	String location;
	public Stock[] arr=new Stock[20];
	int k=0;
	
	public Store(){
		this.name="";
		this.location="";
	}
	public Store(String name,String location){
		this.name=name;
		this.location=location;
	}
	
	void NewProduct(int choise){
		if(choise==1){  //za nov produkt tip meso//choise e izbora na prodavacha kakuv e tipa na produkta dali meso ili drugo
			String name1;
			String type1;
			System.out.println("Enter name of product");
			name1=input.nextLine();
			System.out.println("Enter type of product");
			type1=input.nextLine();
			
			arr[counter]=new meat(name1,type1);
			
			counter++;
		}
		if(choise==2){//tip zelenchuk
			String name1;
			String type1;
			System.out.println("Enter name of product");
			name1=input.nextLine();
			System.out.println("Enter the country of product");
			type1=input.nextLine();
			
			arr[counter]=new vegetables(name1,type1);
			
			counter++;
		}
		if(choise==3){//za drink
			String name1;
			String type1;
			System.out.println("Enter name of product");
			name1=input.nextLine();
			System.out.println("Enter the type of product");
			type1=input.nextLine();
			
			arr[counter]=new drink(name1,type1);
			
			counter++;
		}
		if(choise==4){
			String name1;
			String type1;
			System.out.println("Enter name of product");
			name1=input.nextLine();
			System.out.println("Enter the type of product");
			type1=input.nextLine();
			
			arr[counter]=new desert(name1,type1);
			
			counter++;
		}
	}
	void Available(int p){
		if(p==1){ //kolko meso ima v nalichnost
			 meat counter=new meat();
			 counter.Available();
		}
		if(p==2){//kolko zelenchuk ima;
			vegetables counter=new vegetables();
			 counter.Available();
		}
		if(p==3){//kolko drink ima
			drink counter=new drink();
			 counter.Available();
		}
		if(p==4){ // kolko deserti ima
			desert counter=new desert();
			 counter.Available();
		}
	}
	
}
