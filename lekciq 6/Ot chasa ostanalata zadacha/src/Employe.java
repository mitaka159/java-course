
public class Employe {

	int hours;
	int salary;
	
	public Employe(){
		hours=0;
		salary=0;
	}
	public Employe(int hours,int salary){
		this.hours=hours;
		this.salary=salary;
	}
	
	void SetHours(int hours1){
		this.hours=hours1;
	}
	void SetSulary(int salary2){
		this.salary=salary2;
	}
	void Print(){
		System.out.println(hours);
		System.out.println(salary);
	}
}
