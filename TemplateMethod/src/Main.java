
public class Main {
	public static void main(String[] args) {
		Person person = new Person("Diego","Milito",34);
		Transformer transformer = new XMLTransformer();
		transformer.transform(person);
		transformer = new HTMLTransformer();
		transformer.transform(person);
	}
}
