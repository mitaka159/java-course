
public class Proffesor extends Lecturer {
String tittle;

public Proffesor(){
	super();
	this.tittle="";
}
public Proffesor(String university2,String name,int exp,int age,String tittle){
	super(university2,name,exp,age);
	this.tittle=tittle;
}
public void  Tell(){
	System.out.println("The tittle is: "+tittle+" Worked years are: " +exp);
}
public void Homework(){
	System.out.println("Cheking all homeworks of all students");
}
public void Exam(){
	System.out.println("Examinating students");
}
}
