
public class Leaf implements Component {
	
	private String label;
	
	public Leaf(String label) {
		this.label = label;
	}

	@Override
	public void operation() {
		System.out.println(label);
	}

	@Override
	public void addComponent(Component component) {
		throw new UnsupportedOperationException();
	}
	
}
