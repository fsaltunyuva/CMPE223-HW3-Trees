// Title: Read Input File Class
// Description: The sub-module reads the .txt file whose name is entered by the user. Also, we have scanner entity in order to get input values one by one for each call of method read.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadInputsTxt {
	private String fileName;
	private Scanner scanner;

	// Constructor takes 1 parameters which is file name of the input file
	public ReadInputsTxt(String fileName) throws FileNotFoundException {
		this.fileName = fileName;
		scanner = new Scanner(new File(this.fileName));
	}

	// Method that takes the object of file
	public String read() throws FileNotFoundException {

		// in each method call scanner moves 1 step forward
		while (scanner.hasNext()) {
			return scanner.next();
		}
		return "Quit";

	}

}