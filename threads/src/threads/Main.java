package threads;

public class Main extends Thread {

	public static void main(String[] args) {
		
		Main thread = new Main();
		
		thread.start();	
		
		for(int i = 0; i < 4; i++) {
			System.out.println("This is the main thread");
		}
		
		
	}
	public void run() {
		for(int a = 1; a < 21; a++) {
			System.out.println(a);
		}
	}
	

}
