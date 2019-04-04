import java.util.ArrayList;
import java.util.Collections;

public class Schedular {
	private ArrayList<Process> lowPriority; 
	private ArrayList<Process> mediumPriority; 
	private ArrayList<Process> highPriority;
	
	Schedular(){
		lowPriority = new ArrayList<Process>();
		mediumPriority = new ArrayList<Process>();
		highPriority = new ArrayList<Process>();
	}
	/**
	 * Will add Process e to to correct queue based on its priority
	 * @param e
	 */
	public void addToQueue(Process e) {
		switch(e.getPriority()) {
		case 1:
			highPriority.add(e);
			break;
		case 2:
			mediumPriority.add(e);
			break;
		case 3:
			lowPriority.add(e);
			break;
			}
	}
	/**
	 * This will sort the given priority queue (i) so that arrival time is in ascending order
	 * @param i Where 1 = highPriority, 2 = mediumPriority, 3 = lowPriority
	 */
	public void sortQueue(int i) {
		switch(i) {
		case 1:
			Collections.sort(highPriority);
			break;
		case 2:
			Collections.sort(mediumPriority);
			break;
		case 3:
			Collections.sort(lowPriority);
			break;
			}
	}
	/**
	 * Method that prints out the contents of all queues
	 * Mainly for testing and demonstration purposes
	 */
	public void showAllQueues() {
		System.out.println("These are high priority processes");
		for (int j = 0;j<highPriority.size();j++) {
			System.out.printf("PID: %4d| ArrivalTime: %4d| BurnTime: %3d| Priority: %1d%n",highPriority.get(j).getPid(),highPriority.get(j).getArrivalTime(),highPriority.get(j).getBurstTime(),highPriority.get(j).getPriority());
		}
		System.out.println("These are medium priority processes");
		for (int k = 0;k<mediumPriority.size();k++) {
			System.out.printf("PID: %4d| ArrivalTime: %4d| BurnTime: %3d |Priority: %1d%n",mediumPriority.get(k).getPid(),mediumPriority.get(k).getArrivalTime(),mediumPriority.get(k).getBurstTime(),mediumPriority.get(k).getPriority());
		}
		System.out.println("These are low priority proccesses");
		for (int l = 0;l<lowPriority.size();l++) {
			System.out.printf("PID: %4d| ArrivalTime: %4d| BurnTime: %3d |Priority: %1d%n",lowPriority.get(l).getPid(),lowPriority.get(l).getArrivalTime(),lowPriority.get(l).getBurstTime(),lowPriority.get(l).getPriority());
		}
	}
	
	public void start() {
		System.out.println("*******EXECUTION ORDER********");
		while(true) {//CHANGE THIS
			Process pr;
			if (highPriority.size() != 0) {
				pr = highPriority.get(0);
				System.out.printf("PID: %4d| ArrivalTime: %4d| BurnTime: %3d| Priority: %1d%n", pr.getPid(),pr.getArrivalTime(),pr.getBurstTime(),pr.getPriority());
				highPriority.remove(0);
			}
			else if(mediumPriority.size() != 0){
				pr = mediumPriority.get(0);
				System.out.printf("PID: %4d| ArrivalTime: %4d| BurnTime: %3d| Priority: %1d%n", pr.getPid(),pr.getArrivalTime(),pr.getBurstTime(),pr.getPriority());
				mediumPriority.remove(0);
			}
			else if(lowPriority.size() != 0) {
				pr = lowPriority.get(0);
				System.out.printf("PID: %4d| ArrivalTime: %4d| BurnTime: %3d| Priority: %1d%n", pr.getPid(),pr.getArrivalTime(),pr.getBurstTime(),pr.getPriority());
				lowPriority.remove(0);
				
			}
			else {
				System.out.println("All queues are empty");
				break;
			}
		}
	}
	

}
