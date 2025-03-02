package DI;

public class SMSService implements MessageService {
	private String sms;

	public void sendMessage(String sms) {
		System.out.println("SMS: " + sms);
	}
}
