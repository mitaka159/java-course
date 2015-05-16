
public class Converter {

	
	double faren;
	
	public Converter(){
		
		this.faren=0;
	}
	public Converter(double celsii){
		this();
		this.faren=celsii*1.8+32;
		
	}
	void print(){
		System.out.println("In Farenhait is:" +faren);
	}
}
