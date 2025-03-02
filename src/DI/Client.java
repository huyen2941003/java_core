package DI;

public class Client {
	private MessageService messageService;

	public Client(MessageService messageService) {
		this.messageService = messageService;
	}

	public void send(String message) {
		messageService.sendMessage(message);
	}
}
