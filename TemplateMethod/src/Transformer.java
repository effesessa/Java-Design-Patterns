
public abstract class Transformer {
	
	public void transform(Person person) {
		doSomething();
		doOperation(person);
		finish();
	}
	
	public void doSomething() {
		System.out.println("do something...");
	}
	
	public abstract void doOperation(Person person);
	
	public abstract void finish();
}
