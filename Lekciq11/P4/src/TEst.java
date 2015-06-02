
public class TEst {

	public static void main(String[] args) {
		Device_Factory temp=Device_Factory.getInstance();
		temp.create("Phone");
		temp.create("Laptop");
		temp.create("Tablet");

	}

}
