package invoker;

import java.util.ArrayList;
import java.util.List;

import command.Command;
import command.ExitCommand;
import command.OpenCommand;
import receiver.Receiver;

public class Invoker {
	
	private List<Command> commands;
	
	private Command command;
	
	public Invoker(Receiver receiver) {
		commands = new ArrayList<Command>();
		commands.add(new OpenCommand(receiver));
		commands.add(new ExitCommand(receiver));
	}
	
	public void setCommand(TypeCommand typeCommand) {
		switch (typeCommand) {
		case OPEN:
			command = commands.get(TypeCommand.OPEN.ordinal());
			break;
		case EXIT:
			command = commands.get(TypeCommand.EXIT.ordinal());
			break;
		default:
			break;
		}
	}
	
	public void execute() {
		command.execute();
	}
}
