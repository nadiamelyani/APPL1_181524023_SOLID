package Model;

import Interface.ISleeper;

public class Employee extends Worker implements ISleeper{

	public Employee(String id) {
		super(id);
	}
	
	@Override
	public void sleep() {
		System.out.println("Employee : sleep");
	}
}
