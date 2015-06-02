
public class Tablet extends Device{

	int monitor;

	public Tablet(int monitor,String model,String mark) {
		super();
		this.monitor = monitor;
		this.mark=mark;
		this.model=model;
	}

	public Tablet() {
		super();
		
	}

	@Override
	public void Info() {
		
		super.Info();
		System.out.println(monitor);
	}
	
	
}
