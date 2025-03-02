package DI;

public class EmailService implements MessageService {
	private String email;

	public void sendMessage(String email) {
		System.out.println("Email: " + email);
	}
}