package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		
		try {
		File MyFile = new File("C:\\Users\\Dorian\\Documents\\directory.txt");
		
		Scanner myReader = new Scanner(MyFile);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		}
		
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
		

	}

}
