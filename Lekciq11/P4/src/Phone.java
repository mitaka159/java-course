
public class Phone extends Device {

	int price;

	public Phone() {
		super();
		
	}

	public Phone(int price,String model,String mark) {
		super();
		this.price = price;
		this.mark=mark;
		this.model=model;
	}

	@Override
	public void Info() {
		
		super.Info();
		System.out.println(price);
	}
	
}
