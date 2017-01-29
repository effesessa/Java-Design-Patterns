
public class Memento {

	private Object mementoState;
	
	public Memento() {}
	
	public void setMementoState(Object currentState) {
		mementoState = currentState;
	}
	
	public Object getMementoState() {
		return mementoState;
	}

}
