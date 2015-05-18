
public class Asistent extends Lecturer {

	String type;
	
	public Asistent(){
		super();
		type="";
	}
	public Asistent(String university2, String name, int exp, int age,String type){
		super(university2,name,exp,age);
		this.type=type;
	}
	public void Info(){
		System.out.println("Asistent name:"+name+" Asistent type :" +type);
	}
	public void Article(){
		System.out.println("Writing article");
	}
	public void Check(){
		System.out.println("Checking Exam");
	}
	public void Homework(){
		System.out.println("Cheking homeworks for specific group");
	}
}
