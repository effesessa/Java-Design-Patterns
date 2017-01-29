
public class DeepVisit<T> implements Visit<T> {

	@Override
	public void visit(Node<T> root) {
		System.out.print(root);
		for(Node<T> node: root.getChildren())
			visit(node);
	}

}
