import java.util.ArrayList;

public class Node<T> {
	
	private T value;
	
	private ArrayList<Node<T>> children;
	
	@SuppressWarnings("unchecked")
	public Node(T value){
		this.value = value;
		children = (ArrayList<Node<T>>) new ArrayList<T>();
	}
	
	public ArrayList<Node<T>> getChildren() {
		return children;
	}
	
	public T getValue() {
		return value;
	}
	
	public void addChildren(Node<T> node) {
		children.add(node);
	}
	
	@Override
	public String toString() {
		return "[" + value + "]";
	}
	
}
