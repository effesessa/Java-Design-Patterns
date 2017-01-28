
public class Main {
	
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		if(!instance1.equals(instance2))
			System.out.println("I'm not a singleton");
		else
			System.out.println("It's impossible,I'm a Singleton!");
	}
}
