package inheritance;


public class Student extends User{
	private String firstName;
	private String lastName;
	private int birthYear;

	
	public Student() {
		
	}

	public Student(int id,String firstName, String lastName, int birthYear, String email, String password) {
		super(id,email,password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
}
