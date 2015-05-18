
public class Lecturer extends Person {
	
	String University;
	protected static final int  hours=10;
	
	public Lecturer(){
		University="0";
		getAge(0);
		getName("");
		getExp(0);
	}
	
	public Lecturer(String university2, String name, int exp, int age) {
		if(exp<0){
			System.out.println("Can't create with negative exp");
		}
		else{
		this.University=university2;
		getName(name);
		getAge(age);
		getExp(exp);
		}
	}
	public void Homework(){
		System.out.println("Checking Homework");
	}
	public void Method(){
		System.out.println("1st method for exercise");
	}
	public void Method(String way){
		System.out.println("2nd method for exercise"+way);
	}
	public void Method(String way,String way1 ){
		System.out.println("3rd method for exercise"+way+way1);
	}
	public void GoodDay(){
		System.out.println("Good day");
	}

}
