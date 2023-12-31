// Title: Main Class
// Description: Main -Runner- class with main method.

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(System.in);
		CaptainBST captainBST = new CaptainBST();

		// variable for given input file name
		String fileName = scanner.next();

		ReadInputsTxt readInput = new ReadInputsTxt(fileName);
		scanner.close();
		boolean quitReq = false;
		System.out.println("--------------- WELCOME TO CDRC SYSTEM ---------------");

		// while loop which runs until quit request is false
		while (!quitReq) {

			try {
				String userInput = readInput.read();
				// switch-case structure based on user input
				switch (userInput) {
					case "Add_Captain":
						System.out.println("Add Captain: Add a new captain record in the System");
						int id;
						String name;
						id = Integer.parseInt(readInput.read());

						name = readInput.read();

						captainBST.insert(id, new Captain(id, name));
						captainBST.display(id);
						System.out.println("----------------------------------------------------------------");
						break;

					case "Is_Available":
						System.out.print("IsAvailable: ");
						id = Integer.parseInt(readInput.read());
						captainBST.isAvailable(id);
						System.out.println();
						System.out.println("----------------------------------------------------------------");
						break;
					case "Display_captain":
						System.out.print("Display Captain: ");
						id = Integer.parseInt(readInput.read());
						captainBST.display(id);
						System.out.println();
						System.out.println("----------------------------------------------------------------");
						break;
					case "Finish":
						System.out.print("Finish: ");
						id = Integer.parseInt(readInput.read());
						int rating = Integer.parseInt(readInput.read());
						captainBST.finish(id, rating);
						System.out.println("----------------------------------------------------------------");
						break;
					case "Delete_captain":
						System.out.print("Delete Captain:");
						id = Integer.parseInt(readInput.read());
						captainBST.delete(id);
						System.out.println("----------------------------------------------------------------");
						break;
					case "Display_all_captains":
						System.out.println("----------ALL CAPTAINS----------");
						captainBST.printInorder();
						break;
					case "Quit":

						System.out.println("Thank you for using CDRC, Good Bye!");
						System.exit(0);
					default:
						break;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
