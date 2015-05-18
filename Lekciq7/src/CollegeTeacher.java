
public class CollegeTeacher extends Teacher {
	String college;
	
	public CollegeTeacher(){
		super();
		this.college="";
	}
	public CollegeTeacher(String subject,String name,int exp,int age,String college){
		super(subject,name,exp,age);
		this.college=college;
	}

}
