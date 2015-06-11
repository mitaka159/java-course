
public class Nishka1 extends Thread{

	MethodSync obj;
	Nishka1(MethodSync obj){
		this.obj=obj;
	}
	public void run(){
		obj.Printer();
	}
}
