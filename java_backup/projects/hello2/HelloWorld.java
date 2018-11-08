import edu.duke.*;

public class HelloWorld {
	/**
	 * Read file of ways to say hello and print each line of the file
	 */
	public void sayHello(){
		URLResource rs = new URLResource("http://nytimes.com"); 
		for (String line : rs.lines()) {
			System.out.println(line);
		}
	}
}
