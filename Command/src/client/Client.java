package client;

import invoker.Invoker;
import invoker.TypeCommand;
import receiver.Receiver;

public class Client {
	
	public static void main(String[] args) {
		Invoker invoker = new Invoker(new Receiver());
		invoker.setCommand(TypeCommand.OPEN);
		invoker.execute();
		invoker.setCommand(TypeCommand.EXIT);
		invoker.execute();
	}
	
}
