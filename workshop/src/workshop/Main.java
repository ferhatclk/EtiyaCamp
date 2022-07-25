package workshop;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Mustafa", "Salih","mustafa@gmail","98765","5342155262",new EmailNotification());
		
		UserManager userManager = new UserManager(user.getNatificationService());
		userManager.register(user);
		userManager.forgotPassword(user);
		
		for (User name : userManager.getAll()) {
			System.out.println(name.getFirstName());
		}
		
		
	}

}
