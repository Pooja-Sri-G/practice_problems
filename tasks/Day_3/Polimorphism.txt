package classProblems;

class Shapes{
	void area() {
		System.out.println("Calculating Area of Shapes");
	}
	
	void area(int a) {
		System.out.println("Area of Square = "+(a*a));
		
	}
	void area(int l, int b) {
		System.out.println("Area of Rectangle = "+(l*b));
		
	}
	void area(float f, int b, int h) {
		System.out.println("Area of Triangle = "+(f*b*h));
		
	}
	void area(double pi, int r) {
		System.out.println("Area of Circle = "+(pi*r*r));
		
	}
}

class BankAccounts{
	int balance;
	
	BankAccounts(int bal){
		balance = bal;
	}
	void deposit(int amt) {
		balance += amt;
		System.out.println("Amount deposited");
	}
	
	void deposit(int amt, String description) {
		balance += amt;
		System.out.println("Amount deposited." + description);
	}
	
	void deposit(int amt, String description, int id_no) {
		balance += amt;
		System.out.println("Amount deposited. " + description+". ID = "+id_no);
		
	}
	void interest_calculation() {
		System.out.println("Interest for Savings account = 6%\nInterest for Current Account = 2%");
	}
}

class Savings extends BankAccounts{
	
	Savings(int bal) {
		super(bal);
	}

	void interest_calculation(){
		super.interest_calculation();
		System.out.println("Interest (6%) = "+((balance/100)*6));
	}
	
}

class Current extends BankAccounts{
	

	Current(int bal) {
		super(bal);
	}

	void interest_calculation(){
		
		System.out.println("Interest (2%) = "+((balance/100)*2));
	}
}

class VehicleRental{
	String v_no;
	String brand;
	long rent;
	
	/*VehicleRental(String v_no, String brand, long rent){
		this.v_no = v_no;
	}
	*/
	
	void vehicle() {
		System.out.println("Bus Car Bike Van Lorry");
	}
	
	void vehicle(int days) { //bus 1000
		System.out.println("Rental Cost for Bus for "+days+" = "+rent_calculation(days,1000));
	}

	void vehicle(String num, int days) {//car 500
		System.out.println("Rental Cost for Bus for "+days+" = "+rent_calculation(days,500));
	}

	void vehicle(int amount, String num, int days, String brand) {//bike 250
		System.out.println("Rental Cost for Bus for "+days+" = "+rent_calculation(days,250));
	}
	
	void vehicle(int amt, String num, String time, int days) {//van 750 lorry 1500
		System.out.println("Rental Cost for Bus for "+days+" = "+rent_calculation(days,750));
		
	}
	
	void vehicle(int amt, String num, int days) {
		System.out.println("Rental Cost for Bus for "+days+" = "+rent_calculation(days,500));
	}
	
	double rent_calculation(int days, int rent) {
		return (rent*days )+ ((rent/100)*2.5);
	}
}

class dayRent extends VehicleRental{
	double rent_calculation(int days, int rent) {
		return (rent*days )+ ((rent/100)*2.5);
	}
}

class hoursRent extends VehicleRental{
	double rent_calculation(int hours, int rent) {
		return (rent*hours )+ ((rent/100)*2.5);
	}
}
public class polymorphismSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shapes s = new Shapes();
		
		s.area();
		s.area(4);
		s.area(5, 10);
		s.area((float)0.5, 3, 4);
		s.area(3.14, 5);
		
		System.out.println();
		
		BankAccounts b = new BankAccounts(90000);
		b.deposit(0);
		b.deposit(5000, "Deposit no 1");
		b.deposit(10000,"Deposit no 2", 108);

		System.out.println();
		
		Savings sav = new Savings(500000);
		
		sav.interest_calculation();
		
		Current c = new Current(80000);
		
		c.interest_calculation();
	}

}
