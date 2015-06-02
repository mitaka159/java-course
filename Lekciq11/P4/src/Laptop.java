
public class Laptop extends Device {
    int size;
    Laptop(){
    	super();
    }
    Laptop(int size,String model,String mark){
    	this.mark=mark;
    	this.model=model;
    	this.size=size;
    }
    public void Info(){
		System.out.println(model);
		System.out.println(mark);
		System.out.println(size);
	}
}
