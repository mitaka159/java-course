import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
class P6 {

	public static void main(String[] args) {
		try {
		FileReader fileReader = new FileReader("mitko.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		FileWriter fileStream = new FileWriter("mitko1.txt");
		BufferedWriter writer = new BufferedWriter(fileStream);
		
		while (bufferedReader.ready()) {
			String line = bufferedReader.readLine();
			String mitko=line.replaceAll("\\."," ");
			mitko=mitko.replaceAll("\\,"," ");
			mitko=mitko.replaceAll("\\!"," ");
			mitko=mitko.replaceAll("\\?"," ");
			mitko=mitko.replaceAll("\\;"," ");
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
		
	}

}
