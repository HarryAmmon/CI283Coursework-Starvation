import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
	static ArrayList<Process> processes = new ArrayList<Process>();
	public static void main(String[] args) throws IOException {
		readCSV("./processes.csv");
		ArrayList<Process> lowPriority = new ArrayList<Process>();
		ArrayList<Process> mediumPriority = new ArrayList<Process>();
		ArrayList<Process> highPriority = new ArrayList<Process>();
		for (int i = 0;i<processes.size();i++) {
			switch(processes.get(i).getPriority()) {
			case 1:
				highPriority.add(processes.get(i));
				break;
			case 2:
				mediumPriority.add(processes.get(i));
				break;
			case 3:
				lowPriority.add(processes.get(i));
				break;
				}
			}
		/*for(int a = 0;a<processes.size();a++) {
			System.out.println(processes.get(a).getPriority());
		}
		System.out.println("These are high priority processes");
		for (int j = 0;j<highPriority.size();j++) {
			System.out.printf("PID: %d Priority: %d%n",highPriority.get(j).getPid(),highPriority.get(j).getPriority());
		}
		System.out.println("These are medium priority processes");
		for (int k = 0;k<mediumPriority.size();k++) {
			System.out.printf("PID: %d Priority: %d%n",mediumPriority.get(k).getPid(),mediumPriority.get(k).getPriority());
		}
		System.out.println("These are low priority proccesses");
		for (int l = 0;l<lowPriority.size();l++) {
			System.out.printf("PID: %d Priority: %d%n",lowPriority.get(l).getPid(),lowPriority.get(l).getPriority());
		}*/
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
