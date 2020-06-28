package Model;

public class Employee {
	String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	
}
