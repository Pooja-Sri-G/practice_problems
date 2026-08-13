package classProblems;

abstract class Employeee{
	private String name;
	private double salary;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	abstract double bonus_cal();
	
	abstract void displayDetails();
}

class developer extends Employeee{

	@Override
	double bonus_cal() {
		// TODO Auto-generated method stub
		return (getSalary()/100)*4;
	}

	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Designation = "+getName());
		System.out.println("Salary = "+getSalary());
		System.out.println("Bonus = "+bonus_cal());
		System.out.println("Net Salary = "+(getSalary()+bonus_cal()));
		
		System.out.println("");
		
		
	}
	
}

class manager extends Employeee{

	@Override
	double bonus_cal() {
		// TODO Auto-generated method stub
		return (getSalary()/100)*6;
	}

	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Designation = "+getName());
		System.out.println("Salary = "+getSalary());
		System.out.println("Bonus = "+bonus_cal());
		System.out.println("Net Salary = "+(getSalary()+bonus_cal()));
		
		System.out.println("");
		
	}
	
}

class officeWorker extends Employeee{

	@Override
	double bonus_cal() {
		// TODO Auto-generated method stub
		return (getSalary()/100)*2;
	}

	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Designation = "+getName());
		System.out.println("Salary = "+getSalary());
		System.out.println("Bonus = "+bonus_cal());
		System.out.println("Net Salary = "+(getSalary()+bonus_cal()));
		
		System.out.println("");
		
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		developer d = new developer();
		
		d.setName("developer");
		d.setSalary(50000);
		d.displayDetails();
		
		manager m = new manager();
		
		m.setName("Manager");
		m.setSalary(80000);
		m.displayDetails();
		
		officeWorker o = new officeWorker();
		
		o.setName("Office Worker");
		o.setSalary(20000);
		o.displayDetails();
		
	}

}
