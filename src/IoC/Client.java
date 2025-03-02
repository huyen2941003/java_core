package IoC;

import DI.MessageService;

public class Client {
	private MessageService messageService;

	public Client(MessageService messageService) {
		this.messageService = messageService;
	}

	public void send(String message) {
		messageService.sendMessage(message);
	}
}
