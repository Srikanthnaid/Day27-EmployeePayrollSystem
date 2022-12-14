package EmployeePayrollService;

import java.util.*;

public class EmployPayrollService {
	private List<EmployPayrollData> employPayrollDataList;

	public EmployPayrollService() { // default constructor
	}

	public EmployPayrollService(ArrayList<EmployPayrollData> employPayrollDataList) { // parameterized constructor
		this.employPayrollDataList = employPayrollDataList;
	}

	public static void main(String[] args) {
		System.out.println("*************Welcome to EmpPayroll_System**************** ");
		Scanner sc1 = new Scanner(System.in);
		ArrayList<EmployPayrollData> employPayrollDataList = new ArrayList<>();
		EmployPayrollService employPayrollService = new EmployPayrollService(employPayrollDataList);
		employPayrollService.readEmployPayrollData(sc1);
		employPayrollService.writeEmployPayrollData();
	}

	// create write method to print data back to console
	private void writeEmployPayrollData() {
		
	}

	// method to read the input from user through console
	private void readEmployPayrollData(Scanner sc1) {
		System.out.println("Enter your name: ");
		String name = sc1.nextLine();
		System.out.println("Enter your Id: ");
		int id = sc1.nextInt();
		System.out.println("Enter your salary: ");
		double salary = sc1.nextDouble();
		EmployPayrollData empData = new EmployPayrollData(id, salary, name);
		// adding all employee data to the arraylist
		employPayrollDataList.add(empData);
	}

}