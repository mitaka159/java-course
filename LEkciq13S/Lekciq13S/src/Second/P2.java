package Second;

import java.io.BufferedReader;
import java.io.FileReader;


public class P2 {

	public static void main(String[] args) {
		readAllLines("mitko.txt");

	}

public static void readAllLines(String file){
		
	try {
		
		FileReader fileReader = new FileReader(file);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		while (bufferedReader.ready()) {
				String line = bufferedReader.readLine();
				int k=line.length()-1;
				
				if(line.charAt(k)=='?'||line.charAt(k)=='.'||line.charAt(k)=='!'){
					continue;
					
				}
				else{
					bufferedReader.close();
					throw new SighException("No ending symbol");
				}
		}
		
		bufferedReader.close();
		
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
		System.exit(0);
	}
	}
}
