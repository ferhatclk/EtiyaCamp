package inheritance;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Ferhat","ÇELİK",1999,"ferhat@email.com","12345");

		Student student2 = new Student(2,"Selim","KAYGISIZ",1989,"selim@email.com","67891");
		
		Instructor instructor1 = new Instructor(1,"Engin","DEMİROĞ",1988,"engindemirog@email.com","12398");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.add(student2);
		
		studentManager.addLesson(student1, "Java");
		studentManager.addLesson(student2, "C#");
		
		for(User student: studentManager.getAll()) {
			System.out.println(student.getEmail());
		}
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.addHomework("User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)");
		

	}

}
