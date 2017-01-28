
public class Main {
	
	public static void main(String[] args) {
		
		Component root = new Composite("1");
		
		Component component1 = new Composite("2");
		Component component2 = new Composite("3");
		Component leaf = new Leaf("4");
		
		root.addComponent(component1);
		root.addComponent(component2);
		root.addComponent(leaf);
		
		Component leaf1 = new Leaf("5");
		Component leaf2 = new Leaf("6");
		
		component1.addComponent(leaf1);
		component1.addComponent(leaf2);
		
		Component leaf3 = new Leaf("7");
		component2.addComponent(leaf3);
		root.operation();
	}
}
