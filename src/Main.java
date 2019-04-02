import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	ArrayList<String> processes = new ArrayList<String>();
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("./processes.csv"));
		scanner.useDelimiter(",");
		while (scanner.hasNext()) {
			System.out.print(scanner.next());
		}
		scanner.close();
		
	}

}
