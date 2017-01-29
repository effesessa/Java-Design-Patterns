
public class Main {
	
	public static void main(String[] args) {
		
		CareMementoStack careMementoStack = new CareMementoStack();
		
		Originator originator = new Originator();
		
		originator.setCurrentState(new Object());
		
		careMementoStack.push(originator.createMemento());
		
		originator.setCurrentState(new Object());
		
		originator.reverse(careMementoStack.pop());
		
	}
}
