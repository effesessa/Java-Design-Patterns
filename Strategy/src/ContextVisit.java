
public class ContextVisit<T> {
	
	private Visit<T> visit;
	
	private Node<T> root;
	
	public ContextVisit(Node<T> root) {
		this.root = root;
	}
	
	public void setRoot(Node<T> root) {
		this.root = root;
	}
	
	public void setVisit(Visit<T> visit) {
		this.visit = visit;
	}
	
	public void visit() {
		visit.visit(root);
	}
}
