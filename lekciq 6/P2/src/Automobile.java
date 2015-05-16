
public class Automobile extends Car {

	public double fuel;
	
	public Automobile(){
		this.fuel=0;
	}
	public Automobile(double fuel){
		this();
		this.fuel=fuel;
	}
	void print(){
		System.out.println("The price is"+this.price);
		System.out.println("The fuel is"+this.fuel);
	}
}
