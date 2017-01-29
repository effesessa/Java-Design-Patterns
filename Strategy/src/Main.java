
public class Main {
	
	public static void main(String[] args) {
		Node<Integer> node = new Node<Integer>(1);
		Node<Integer> node1 = new Node<Integer>(2);
		Node<Integer> node2 = new Node<Integer>(3);
		Node<Integer> node3 = new Node<Integer>(4);
		Node<Integer> node4 = new Node<Integer>(5);
		Node<Integer> node5 = new Node<Integer>(6);
		Node<Integer> node6 = new Node<Integer>(7);
		Node<Integer> node7 = new Node<Integer>(8);
		node.addChildren(node1);
		node.addChildren(node2);
		node1.addChildren(node3);
		node1.addChildren(node4);
		node2.addChildren(node5);
		node2.addChildren(node6);
		node3.addChildren(node7);
		
		ContextVisit<Integer> contextVisit = new ContextVisit<Integer>(node);
		contextVisit.setVisit(new DeepVisit<Integer>());
		contextVisit.visit();
		System.out.println();
		contextVisit.setVisit(new LevelVisit<Integer>());
		contextVisit.visit();
	}
	
}
