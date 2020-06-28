package Main;

import java.util.ArrayList;

import Model.DetailPrinter;
import Model.Employee;
import Model.Manager;

public class Program {
	public static void main(String[] args) {
		Employee employee = new Employee("Employee name");
		Manager manager = new Manager("Manager name", new ArrayList<String>());

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(employee);
		employees.add(manager);
		DetailPrinter printer = new DetailPrinter(employees);
		printer.printDetails();
		}
}
