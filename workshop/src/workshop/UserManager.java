package workshop;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
	private List<User> users;
	private NotificationService notificationService;
	
	public UserManager(NotificationService notificationService) {
		users = new ArrayList<>();
		this.notificationService = notificationService;
	}
	
	public void register(User user) {
		
		users.add(user);
		notificationService.send(user);
		
	}
	public List<User> getAll(){
		return users;
	}
	
	public void forgotPassword(User user) {
		user.setPassword("12345");
		notificationService.send(user);
		System.out.println("Þifre : " + user.getPassword());
	}
	
}
