package inheritance;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
	private List<User> users;
	
	public UserManager() {
		users = new ArrayList<>();
	}
	
	public void add(User user) {
		users.add(user);
	}
	
	public List<User> getAll(){
		return users;
	}
}
