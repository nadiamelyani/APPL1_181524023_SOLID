package Model;

import Interface.IRechargeable;

public class Robot extends Worker implements IRechargeable {
	
	private int capacity;
	private int currentPower;
	
	public Robot(String id, int capacity) {
		super(id);
		this.capacity = capacity;
	}
	
	public void work(int hours) {
		if(hours > this.currentPower) {
			hours = currentPower;
		}
		super.work(hours);
		this.currentPower -= hours;
	}
	
	public void recharge() {
		this.currentPower = this.capacity;
	}
}
