import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Master {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		Scanner scanner = new Scanner(new File("./countries.csv"));
		scanner.useDelimiter(",");
		while (scanner.hasNext()) {
			System.out.print(scanner.next()+"|");
		}
		scanner.close();
		
	}

}
