package workshop;

public class SmsNotification implements NotificationService{

	@Override
	public void send(User user) {
		System.out.println(user.getFirstName() +" : Sms gönderildi");
		
	}

}
