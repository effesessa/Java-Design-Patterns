
public class Originator {
	
	private Object currentState;
	
	public Originator() {}
	
	public void setCurrentState(Object currentState) {
		this.currentState = currentState;
	}
	
	public Memento createMemento() {
		Memento memento = new Memento();
		memento.setMementoState(currentState);
		return memento;
	}

	public void reverse(Memento memento) {
		currentState = memento.getMementoState();
	}
	
	public Object getCurrentState() {
		return currentState;
	}
	
}
