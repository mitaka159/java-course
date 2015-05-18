
public class Teacher extends Person {

	String subject;
	
	public Teacher(){
		subject="";
		getAge(0);
		getName("");
		getExp(0);
	}
	public Teacher(String subject,String name,int exp,int age){
		if(exp<0){
			System.out.println("Can't create with negative exp");
		}
		else{
		this.subject=subject;
		getName(name);
		getAge(age);
		getExp(exp);
		}
	}
	
	public void Homework(){
		System.out.println("Checking Homework");
	}
	public void Hello(){
		System.out.println("Hello");
	}
	public void GoodDay(){
		System.out.println("Good day");
	}
	public void Bye(){
		System.out.println("Bye");
	}
}
