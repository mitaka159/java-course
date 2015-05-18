
public class SchoolTeacher extends Teacher {
	
	String[] classes=new String[5];
	
	public SchoolTeacher(){
		super();
		this.classes[0]="";
		this.classes[1]="";
		this.classes[2]="";
		this.classes[3]="";
		this.classes[4]="";
	}
	public SchoolTeacher(String subject,String name,int exp,int age,String class1,String class2,String class3,String class4,String class5){
	super(subject,name,exp,age);
	this.classes[0]=class1;
	this.classes[1]=class2;
	this.classes[2]=class3;
	this.classes[3]=class4;
	this.classes[4]=class5;
	}
	
	public void Tell(){
		for(int i=0;i<5;i++){
			System.out.println(classes[i]);
		}
	}
	public void Fun(){
		System.out.println("Making the children happy");
	}

}
