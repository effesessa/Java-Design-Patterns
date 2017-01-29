package command;

import receiver.Receiver;

public class ExitCommand implements Command {

	private Receiver receiver;
	
	public ExitCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.exit();
	}

}
