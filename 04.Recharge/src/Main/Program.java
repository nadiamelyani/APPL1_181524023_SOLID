package Main;

import Model.*;

public class Program {

	public static void main(String[] args) {
		Employee employee = new Employee("employee_Id");
		Robot robot = new Robot("robot_id", 5000);
		
		employee.work(5);
		robot.work(8);
		employee.sleep();
		robot.recharge();
	}
}
