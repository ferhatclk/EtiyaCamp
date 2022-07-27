package entities;

import java.time.LocalDate;

public class Package {
	private int id;
	private String packageName;
	private LocalDate packageCreatedDate;
	private LocalDate packageDueDate;
	private String packageDuration;
	
	public Package() {
		super();
	}

	public Package(int id, String packageName, LocalDate packageCreatedDate, LocalDate packageDueDate,
			String packageDuration) {
		super();
		this.id = id;
		this.packageName = packageName;
		this.packageCreatedDate = packageCreatedDate;
		this.packageDueDate = packageDueDate;
		this.packageDuration = packageDuration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public LocalDate getPackageCreatedDate() {
		return packageCreatedDate;
	}

	public void setPackageCreatedDate(LocalDate packageCreatedDate) {
		this.packageCreatedDate = packageCreatedDate;
	}

	public LocalDate getPackageDueDate() {
		return packageDueDate;
	}

	public void setPackageDueDate(LocalDate packageDueDate) {
		this.packageDueDate = packageDueDate;
	}

	public String getPackageDuration() {
		return packageDuration;
	}

	public void setPackageDuration(String packageDuration) {
		this.packageDuration = packageDuration;
	}
	
	
	
	

}
