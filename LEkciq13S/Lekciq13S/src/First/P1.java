package First;

import java.io.BufferedWriter;
import java.io.FileWriter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class P1 {

	public static void main(String[] args) {
		String file="mitko.txt";
		String file1="mitko1.txt";
		List<String> lines;
try {
			
			lines=readAllLines(file);
			writeAllLines(file1,lines);
			
		} catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}

	}
public static List<String> readAllLines(String file)throws Exception{
		
		
			
			Path path = Paths.get(file);
			
			List<String> lines = Files.readAllLines(path);
			
			
			
			
		return lines;
	}
public static void writeAllLines(String file1,List<String> lines) throws Exception {
	FileWriter fileStream = new FileWriter(file1);
//	FileWriter fileStream = new FileWriter(filePath, true);
	
	BufferedWriter writer = new BufferedWriter(fileStream);
	
	for (int i = 0; i < lines.size(); i++) {
		
		writer.write(lines.get(i));
	}
	
	writer.close();
}

}
