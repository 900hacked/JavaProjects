package file_handling;

import java.io.File;

public class Delete {

	public static void main(String[] args) {
		File myFile = new File("C:\\Users\\Dorian\\Desktop\\directory.txt");
		if (myFile.delete()) {
			System.out.println("Deleted the file " + myFile.getName());
		}else {
			System.out.println("Failed to delete the file");
		}

	}

}
