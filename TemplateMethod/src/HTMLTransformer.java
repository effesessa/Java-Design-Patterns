import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLTransformer extends Transformer {
	
	public HTMLTransformer() {}

	@Override
	public void doOperation(Person person) {
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(new File("person.html"));
			
			fileWriter.write("<html>" + "\n" + "<head>" + "</head>" + "\n" + "<body>" + "\n");
			fileWriter.write("<h1>" + person.getName() + "</h1>" + "\n");
			fileWriter.write("<h1>" + person.getSurname() + "</h1>" + "\n");
			fileWriter.write("<h1>" + person.getAge() + "</h1>" + "\n");
			fileWriter.write("</body>" + "\n" + "</html>");
			fileWriter.flush();
			fileWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void finish() {
		System.out.println("The object has been converted into html.");
	}
}
