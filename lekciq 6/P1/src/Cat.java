
public class Cat {

	public String name;
	public int years;
	
	public Cat(){
		this.name="";
		this.years=0;
	}
	public Cat(String name,int years){
		this();
		this.name=name;
		this.years=years;
	}
	
	void Say(){
		System.out.println("Name is: "+name);
		System.out.println("Years  are: "+years);
		
	}
}
