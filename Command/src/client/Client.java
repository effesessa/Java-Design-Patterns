package client;

import invoker.Invoker;
import invoker.TypeCommand;
import receiver.Receiver;

public class Client {
	
	public static void main(String[] args) throws InterruptedException {
		Invoker invoker = new Invoker(new Receiver());
		invoker.setCommand(TypeCommand.OPEN);
		invoker.execute();
		Thread.sleep(1500);
		invoker.setCommand(TypeCommand.EXIT);
		invoker.execute();
	}
	
}
