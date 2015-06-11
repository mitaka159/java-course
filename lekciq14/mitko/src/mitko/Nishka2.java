package mitko;

public class Nishka2 extends Thread{

	public void run(){
	for(int i=0;i<10000;i++){
		try{

			Thread.sleep(1000);
			
		}catch(Exception c){
			
		}
		System.out.println("sleep");
	}
	}

}
