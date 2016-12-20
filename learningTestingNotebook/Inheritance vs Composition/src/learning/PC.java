package learning;

public class PC {
	private Case thecase;
	private Monitor monitor;
	private Motherboard motherboad;
	
	public PC(Case thecase, Monitor monitor, Motherboard motherboad) {
		this.thecase = thecase;
		this.monitor = monitor;
		this.motherboad = motherboad;
	}

	public Case getThecase() {
		return thecase;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public Motherboard getMotherboad() {
		return motherboad;
	}
	
	
}
