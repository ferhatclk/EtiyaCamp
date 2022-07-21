package homework1;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Backend");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Frontend");
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setName("Java");
		course1.setCategory(category1);
		
		Course course2 = new Course();
		course2.setId(2);
		course2.setName("Angular");
		course2.setCategory(category2);
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		System.out.println(categoryManager.ifCheckCategory("AI"));
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
	
		for (Course course : courseManager.getAll()) {
			System.out.println(course.getName());
			System.out.println(course.getCategory().getName());
			System.out.println("----------------------------");
		}
			

	}

}
