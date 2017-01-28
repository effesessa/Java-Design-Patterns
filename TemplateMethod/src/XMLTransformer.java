import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class XMLTransformer extends Transformer {
	
	public XMLTransformer() {}
	
	@Override
	public void doOperation(Person person) {
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(new File("person.xml"));
			fileWriter.write("<person>" + "\n");
			fileWriter.write("<name>" + person.getName() + "</name>" + "\n");
			fileWriter.write("<surname>" + person.getSurname() + "</surname>" + "\n");
			fileWriter.write("<age>" + person.getAge() + "</age>" + "\n");
			fileWriter.write("</person>");
			fileWriter.flush();
			fileWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void finish() {
		System.out.println("The object has been converted into xml.");
	}
}
