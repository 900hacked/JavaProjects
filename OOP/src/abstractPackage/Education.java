package abstractPackage;

public class Education extends Lesson {
	
	public void lessonTime() {
		System.out.println("Lessons are from 8am to 4pm");
	}
	
	public void subjects() {
		System.out.println("we have 10 subjects");
	}

	public static void main(String[] args) {
		
		Education myClass = new Education();
		myClass.lessonTime();
		myClass.subjects();
		myClass.meals();
		myClass.school();

	}

}
