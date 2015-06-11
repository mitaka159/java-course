
public class MethodSync {
   int flag=0;
	synchronized void Printer(){
		if(flag==0){
			for(int i=1;i<=50000;i++){
				if(i==25001){
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(i);
				flag=1;
				
			}
			
		}
		else{
			for(int i=0;i<20;i++){
				System.out.println("Running");
				flag=100;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			notify();
		}
		
		
	}
	
	
}
