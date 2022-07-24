package inheritance;

public class Instructor extends User{
	private int userId;
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Instructor() {
		
	}

	public Instructor(int userId,String firstName, String lastName, int birthYear, String email, String password) {
		super(userId,email,password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
