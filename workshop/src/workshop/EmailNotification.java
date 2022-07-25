package workshop;

public class EmailNotification implements NotificationService{

	@Override
	public void send(User user) {
		System.out.println(user.getFirstName() + " : Email gönderildi");
		
	}

}
