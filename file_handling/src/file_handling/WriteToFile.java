package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		
		try {
		FileWriter objWrite = new FileWriter("C:\\Users\\Dorian\\Documents\\directory.txt");
		objWrite.write("Java is Fun and tricky");
		objWrite.close();
		System.out.println("Successfully wrote to the file");
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
