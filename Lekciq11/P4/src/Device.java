
public abstract class Device {

	protected String model;
	protected  String mark;
	
	public Device(){
		super();
	}
	
	public void Info(){
		System.out.println(model);
		System.out.println(mark);
	}
}
