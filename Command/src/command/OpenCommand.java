package command;

import receiver.Receiver;

public class OpenCommand implements Command {
	
	private Receiver receiver;
	
	public OpenCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.open();
	}

}
