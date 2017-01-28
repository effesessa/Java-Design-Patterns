import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	private String label;
	
	private List<Component> children;
	
	public Composite(String label) {
		this.label = label;
		children = new ArrayList<Component>();
	}
	
	@Override
	public void operation() {
		System.out.println(label);
		for(Component component:children)
			component.operation();
	}
	
	public void addComponent(Component component) {
		children.add(component);
	}

}
