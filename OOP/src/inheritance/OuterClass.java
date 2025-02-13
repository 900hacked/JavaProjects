package inheritance;

public class OuterClass {
	int y =5;
	
	 class InnerClass {
		 public int myInnerMethod() {
			 return y;
		 }
	}

	public static void main(String[] args) {
		
		OuterClass out = new OuterClass();
		
		System.out.println(out.y);
		
		OuterClass.InnerClass inn = out.new InnerClass();
		
		System.out.println(inn.myInnerMethod());
		
		System.out.println(Child.attribute);
		
		

	}

}
