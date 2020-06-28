package Model;

import java.util.ArrayList;

public class DetailPrinter {
	private ArrayList<Employee> employees = new ArrayList<>();
	
	public DetailPrinter(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public void printDetails() {
		Iterable<Employee> employeeIter= this.employees;
		
		for(Employee employee : employeeIter) {
			System.out.println(employee);
		}
	}
}
