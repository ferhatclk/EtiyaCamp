package inheritance;


public class InstructorManager extends UserManager{

	public void addLesson(Instructor instructor, String lesson) {
		System.out.println(instructor.getFirstName() + " : " + lesson + " eklendi.");
	}
}
