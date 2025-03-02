package DI;

public class Main {
	public static void main(String[] args) {
		SMSService sms = new SMSService();
		EmailService email = new EmailService();

		Client client = new Client(sms);
		String message = "Hello";
		client.send(message);
	}
}
