
public class Device_Factory {

	private static Device_Factory instance = new Device_Factory();
	
	private Device_Factory(){
		 
	 }
	 
	 //Get the only object available
	 public static Device_Factory getInstance(){
		 return instance;
	 }
	 public void create(String type){
		 if(type.equals("Tablet")){
			 Tablet mitko=new Tablet(15,"Dimitar","Lud");
			 mitko.Info();
		 }
		 if(type.equals("Phone")){
			 Phone mitko=new Phone(100,"Dimitar1","Lud1");
			 mitko.Info();
		 }
		 if(type.equals("Laptop")){
			 Laptop mitko=new Laptop(200,"Dimitar2","Lud2");
			 mitko.Info();
		 }
	 }
}
