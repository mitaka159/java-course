
public class Nishka extends Thread {

	MethodSync obj;
	Nishka(MethodSync obj){
		this.obj=obj;
	}
	public void run(){
		obj.Printer();
	}
}
