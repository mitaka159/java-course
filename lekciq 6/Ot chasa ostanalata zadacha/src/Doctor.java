
public class Doctor extends Employe {

	int nights;
	int allday;
	
	public Doctor(){
		nights=0;
		allday=0;
	}
	public Doctor(int nights,int allday){
		this.nights=nights;
		this.allday=allday;
	}
	
	void SetAllday(int allday){
		this.allday=allday;
	}
	void SetNights(int nights){
		this.nights=nights;
	}
	void Print(){
		System.out.println(nights);
		System.out.println(allday);
	}
}
