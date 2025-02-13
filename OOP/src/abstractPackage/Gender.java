package abstractPackage;

public class Gender {

	public static void main(String[] args) {
		
//		System.out.println(Sex.MALE);
//		System.out.println(Sex.FEMALE);
		
		String[] collect = {"Male", "Female","Man","Woman","Child","Adult"};
		
//		for(String x : collect) {
//			System.out.println(x);
//		}
		
		for(Sex t : Sex.values()) {
			System.out.println(t);
		}

	}

}
