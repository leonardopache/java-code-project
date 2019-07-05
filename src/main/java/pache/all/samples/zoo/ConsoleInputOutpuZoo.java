package pache.all.samples.zoo;

import java.io.Console;
import java.io.IOException;

/**
 * 
 * @author lmarquespache
 *
 */
public class ConsoleInputOutpuZoo {

	public static void main(String[] args) throws IOException {
		Console console = System.console();

		if (console == null) {
			System.out.println("Console is not supported");
			System.exit(1);
		}
		Zoo zoo = new Zoo();
		zoo.createDummyZoo();

		int option = 0;
		while (option != 4) {
			option = showMenu(console);

			switch (option) {
			case 1:
				zoo.createDummyZoo();
				console.printf("Animals in zoo has been created: \n");
				break;
			case 2:
				zoo.showZoo();
				break;
			case 3:
				zoo.liveOneDay();
				break;
			case 4:
				System.out.println("Byee!!");
				break;
			default:
				System.out.println("Errr, this options is not available!!");
			}
		}
	}

	private static int showMenu(Console console) {
		console.printf("Choose the Options: \n");
		console.printf("1 - Reset Zoo \n");
		console.printf("2 - Show Zoo Animals  \n");
		console.printf("3 - Live day Zoo  \n");
		console.printf("4 - Exit  \n \n");
		while (true) {
			try {
				return Integer.parseInt(console.readLine());
			} catch (NumberFormatException n) {
			}
		}
	}
}
