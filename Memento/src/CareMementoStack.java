import java.util.Stack;

public class CareMementoStack {
	
	private Stack<Memento> stackMemento;
	
	public CareMementoStack() {
		stackMemento = new Stack<Memento>();
	}
	
	public CareMementoStack(Memento memento) {
		stackMemento.add(memento);
	}
	
	public Memento pop() {
		return stackMemento.pop();
	}
	
	public void push(Memento memento) {
		stackMemento.push(memento);
	}
}
