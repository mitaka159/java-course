import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class PCLASS2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		try {
			FileReader fileReader = new FileReader("countries.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			FileWriter fileStream = new FileWriter("cities.txt");
			BufferedWriter writer = new BufferedWriter(fileStream);
			
			while (bufferedReader.ready()) {
				String line = bufferedReader.readLine();
				System.out.println("What is the capital of "+line);
				String mitko=input.nextLine();
				writer.write(mitko);
				writer.newLine();
				
		}
			writer.close();
			bufferedReader.close();
			
			} catch (Exception e) {
				System.out.println("Error while reading a file.");
				
				System.out.println(e.getMessage());
				System.exit(0);
			}
        input.close();
	}

}
