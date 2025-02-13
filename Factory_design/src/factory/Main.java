package factory;

public class Main {
	
	

	public static void main(String[] args) {
		
		int numbers[] = {45, 60, 3 ,7, 70, 2, 20};
		
		for(int i: numbers) {
			if( i < 20) {
				System.out.println(i + " is less than 20");
			}
			else if (i > 20) {
				System.out.println(i + " is greater than 20");
			}
			else if (i == 20) {
				System.out.println(i + " is equal to 20");
			}
		}
		for(int x : numbers) {
		switch(x) {
		case 45:
			System.out.println("Middle Aged");
			break;
		case 60:
		case 70:
			System.out.println("Pensioner");
			break;
		case 3:
		case 7:
		case 2:
			System.out.println("Minor");
			break;
		case 20:
			System.out.println("Young Adult");
			break;
			
	}
		}
		String b = "Kalisa Dorian";
		while(b.length() < 20) {
			System.out.println(b.length());
			System.out.println("This is a short name" + b);
			
			b = b + "ex";
		}
		
		int age = 15;
		while(age < 18) {
			System.out.println("This is a child");
			
			age = age + 2;
		}
		
		
	

	}

}
