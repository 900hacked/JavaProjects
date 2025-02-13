package threads;

public class Run implements Runnable {

	public static void main(String[] args) {
		
		Run obj = new Run();
		Thread threads = new Thread(obj);
		
		threads.start();
		
		for(int i = 0; i < 4; i++) {
			System.out.println("This is the main thread");
		}

	}

	@Override
	public void run() {
		for(int a = 1; a < 21; a++) {
			System.out.println(a);
		}
		
	}

}
