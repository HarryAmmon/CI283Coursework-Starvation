public class Process implements Comparable<Process>{
	private int pid;
	private int arrivalTime;
	private int burstTime;
	private int executionTime;
	private int waitTime;
	private int priority;
	
	Process(String process){
		String[] fields = process.split(",");
		this.pid = Integer.parseInt(fields[0]);
		this.arrivalTime = Integer.parseInt(fields[1]);
		this.burstTime = Integer.parseInt(fields[2]);
		this.priority = Integer.parseInt(fields[3]);
		this.executionTime = 0;
		this.waitTime = 0;
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
	
	public int getExecutionTime() {
		return this.executionTime;
	}
	
	@Override
	public int compareTo(Process comparePr) {
		int compareBurstTime = comparePr.getBurstTime();
		return this.burstTime - compareBurstTime;
	}
	
	public void execute(int systemTime){
		this.executionTime = systemTime;
		this.waitTime = executionTime - arrivalTime;
		System.out.printf("PID: %4d | ArrivalTime: %4d | ExecutionTime: %6d | WaitTime: %5d | BurstTime: %4d | Priority: %2d%n", this.pid,this.arrivalTime,this.executionTime,this.waitTime,this.burstTime,this.priority);
	}
	

}
