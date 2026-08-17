package tasks.Day_3;

abstract class HospitalEmployee{
	private int id;
	private String name;
	private double salary;
	
	void setID(int id) {
		this.id = id;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setSalary(double salary) {
		this.salary = salary;
	}
	
	double getSalary() {
		return salary;
	}
	abstract double calculateSalary();
	
	void displayDetails() {
		System.out.println("\nEmployee ID = "+id);
		System.out.println("Employee Name = "+name);
		System.out.println("Employee Salary = "+salary);
	}
}

class Doctor extends HospitalEmployee{

	double consultation = 500;
	Doctor(int no, String name, double amt) {
		setID(no);
		setName(name);
		setSalary(amt);
	}
	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return getSalary()+consultation;
	}
	
}

class Nurse extends HospitalEmployee{

	double ns = 100;
	Nurse(int no, String name, double amt) {
		setID(no);
		setName(name);
		setSalary(amt);
	}
	
	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return getSalary()+ns;
	}
	
}


class LabTechnician extends HospitalEmployee{

	double lab = 500;
	LabTechnician(int no, String name, double amt) {
		setID(no);
		setName(name);
		setSalary(amt);
	}
	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return getSalary()+lab;
	}
	
}
public class HospitalEmployeeManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HospitalEmployee[] list = {
			    new Doctor(101, "AAA", 50000),
			    new Nurse(102, "BBB", 30000),
			    new LabTechnician(103, "CCC", 25000)
			};
		
		for(HospitalEmployee h: list) {
			h.displayDetails();
			System.out.println("Net Salary = "+h.calculateSalary());
		}
		HospitalEmployee highest = list[0];
		if(highest.calculateSalary() < list[1].calculateSalary()) highest = list[1];
		if(highest.calculateSalary() < list[2].calculateSalary()) highest = list[2];
		
		System.out.println("Highest paid employee:");
		highest.displayDetails();
	}

}
