package file_handling;

import java.io.File;
import java.io.IOException;

public class Create {

	public static void main(String[] args) {
		
		File objFile = new File("Java handling.txt");
		
		try {
			boolean x = objFile.createNewFile();
			System.out.println(x);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
		

	}

}
