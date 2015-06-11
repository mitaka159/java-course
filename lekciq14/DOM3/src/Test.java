
public class Test {

	public static void main(String[] args) {
		MethodSync java=new MethodSync();
		Nishka t1=new Nishka(java);
		Nishka1 t2=new Nishka1(java);
		t1.start();
		t2.start();

	}

}
