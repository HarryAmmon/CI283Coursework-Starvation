import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
	static ArrayList<Process> processes = new ArrayList<Process>();
	public static void main(String[] args) throws IOException {
		readCSV("./processes.csv");
		for(int i = 0;i<processes.size();i++) {
			System.out.println(processes.get(i).getArrivalTime());
			}
		}
	
	private static boolean readCSV(String path) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String line = null;
		while((line = reader.readLine()) != null) {
			processes.add(new Process(line));
		}
		reader.close();
		return true;
	}
	
}
