
public class Policeman extends Employe{
	String rang;
	
	public Policeman(){
		rang="";
	}
	public Policeman(String rang){
		this.rang=rang;
		
	}
	void SetRang(String rang){
		this.rang=rang;
	}
	void Print(){
		System.out.println(rang);
	}

}
