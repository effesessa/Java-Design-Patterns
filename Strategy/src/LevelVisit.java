import java.util.ArrayList;

public class LevelVisit<T> implements Visit<T> {

	@Override
	public void visit(Node<T> root) {
		ArrayList<Node<T>> queue = new ArrayList<Node<T>>();
		queue.add(root);
		while(!queue.isEmpty()) {
			System.out.print(queue.get(0));
			queue.addAll(queue.get(0).getChildren());
			queue.remove(0);
		}
	}

}
