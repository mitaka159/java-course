import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class P7 {

	public static void main(String[] args) {
		int count=0;
		try {
			FileReader fileReader = new FileReader("mitko.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			FileWriter fileStream = new FileWriter("mitko2.txt");
			BufferedWriter writer = new BufferedWriter(fileStream);
			FileWriter fileStream1 = new FileWriter("mitko3.txt");
			BufferedWriter writer1 = new BufferedWriter(fileStream1);
			
			while (bufferedReader.ready()) {
				String line = bufferedReader.readLine();
				count++;
				if(count%2==0){
					writer.write(line);
					writer.newLine();
				}
				else{
					writer1.write(line);
					writer1.newLine();
				}
				
		}
			writer1.close();
			writer.close();
			bufferedReader.close();
			
			} catch (Exception e) {
				System.out.println("Error while reading a file.");
				
				System.out.println(e.getMessage());
				System.exit(0);
			}

	}

}
