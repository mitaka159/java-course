
public abstract  class Person {
	private static int count=0;
	protected String name;
	protected int exp;
	protected int age;

	protected void getAge(int age){
		this.age=age;
	}
	protected void getName(String name){
		this.name=name;
		count++;
	}
	protected void getExp(int exp){
		this.exp=exp;
	}
}
