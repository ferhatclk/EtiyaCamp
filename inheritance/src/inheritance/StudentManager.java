package inheritance;

public class StudentManager extends UserManager{
	
	public void addLesson(Student student,String lesson) {
		System.out.println(student.getFirstName() + " : " + lesson + " eklendi.");
	}
	
}
