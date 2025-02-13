package myFirstClass;

public class NestedLoop {

	public static void main(String[] args) {
		
		for (int x = 1; x < 5; x++) {
			System.out.print(x);
			for (int y = 1; y < 5; y++) {
				System.out.println(y * x);
			}
		}

	}

}
