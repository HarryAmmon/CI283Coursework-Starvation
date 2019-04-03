
public class Process implements Comparable<Process>{
	private int pid;
	private int arrivalTime;
	private int burstTime;
	private int priority;
	
	Process(String process){
		String[] fields = process.split(",");
		this.pid = Integer.parseInt(fields[0]);
		this.arrivalTime = Integer.parseInt(fields[1]);
		this.burstTime = Integer.parseInt(fields[2]);
		this.priority = Integer.parseInt(fields[3]);
	}

	public int getPid() {
		return this.pid;
	}
	
	public int getArrivalTime() {
		return this.arrivalTime;
	}
	
	public int getBurstTime() {
		return this.burstTime;
		}
	
	public int getPriority() {
		return this.priority;
	}
	
	public void setPriority(int i) {
		this.priority = i;
	}
	
	@Override
	public int compareTo(Process comparePr) {
		int compareArrivalTime = comparePr.getArrivalTime();
		return this.arrivalTime - compareArrivalTime;
	}
	

}
