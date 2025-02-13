package file_handling;

import java.io.File;
import java.io.IOException;

public class Directories {

	public static void main(String[] args) {
		
		File objFile = new File("C:\\Users\\Dorian\\Documents\\directory.txt");
		
		try {
			boolean z = objFile.createNewFile();
			System.out.println(z);
		} catch(IOException e) {
			System.out.println(e);
		}

	}

}
