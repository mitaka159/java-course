
public class drink extends Stock {
	String name;
	String type;
	static int count=0;
	
	public drink(){
		this.name="";
		this.type="";
	}
	public drink(String name,String type){
		this.name=name;
		this.type=type;
		count++;
	}
	void Available(){
		System.out.println(count);
	}
	void SELL(){
		count=0;
	}
}
