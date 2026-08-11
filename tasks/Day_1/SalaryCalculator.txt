package classProblems;

class Employee{
	int e_id;
	String name;
	float basic;
	float hra, da, bonus, gross, net, tax;
	
	Employee(int e_id, String name, float basic){
		this.e_id= e_id;
		this.name= name;
		this.basic = basic;
	}
	
	void calculate() {
		hra = (basic/100)*20;
		da = (basic/100)*10;
		bonus = (basic/100)*5;
		
		gross = basic+hra+da+bonus;
		tax = (gross/100)*8;
		net = gross-tax;
	}
	
	void display() {
	    System.out.println("Employee ID = " + e_id);
	    System.out.println("Employee Name = " + name);
	    System.out.println("Basic Salary = " + basic);
	    System.out.println("HRA = " + hra);
	    System.out.println("DA = " + da);
	    System.out.println("Bonus = " + bonus);
	    System.out.println("Tax = " + tax);
	    System.out.println("Gross Salary = " + gross);
	    System.out.println("Net Salary = " + net);
	}
	
}
public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(101,"AAA",90000);
		Employee e2 = new Employee(102,"BBB",80000);
		Employee e3 = new Employee(103,"CCC",50000);
		Employee e4 = new Employee(104,"DDD",70000);
		Employee e5 = new Employee(105,"EEE",40000);
		
		e1.calculate();
		e2.calculate();
		e3.calculate();
		e4.calculate();
		e5.calculate();
		
		Employee highest = e1;
		if(e2.net > highest.net) highest = e2;
		if(e3.net > highest.net) highest = e3;
		if(e4.net > highest.net) highest = e4;
		if(e5.net > highest.net) highest = e5;
		

		Employee lowest = e1;
		if(e2.net < lowest.net) lowest = e2;
		if(e3.net < lowest.net) lowest = e3;
		if(e4.net < lowest.net) lowest = e4;
		if(e5.net > lowest.net) lowest = e5;
		
		float avg = (e1.net+e2.net+e3.net+e4.net+e5.net)/5;
		
		System.out.println("Highest salary = "+highest.net);
		System.out.println("Lowest salary = "+lowest.net);
		System.out.println("Average salary = "+avg);
		
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
		
		
		
	}

}
