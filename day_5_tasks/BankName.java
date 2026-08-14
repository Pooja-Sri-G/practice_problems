package day_5_tasks;

class Bank{
	
	int accno;
	String name;
	String bankName;
	Bank(int accno, String name, String bankName){
		this.accno = accno;
		this.name = name;
		this.bankName = bankName;
	}
	
	void display() {
		System.out.println("\nAccount Number = "+accno);
		System.out.println("Customer Name = "+name);
		System.out.println("Bank Name = "+bankName);
	}
}
public class BankName {
	static String bankName = "Mariamman Indian Bank";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b1 = new Bank(101, "aaa", bankName);
		Bank b2 = new Bank(102, "bbb", bankName);
		Bank b3 = new Bank(103, "ccc", bankName);
		
		b1.display();
		b2.display();
		b3.display();
	}

}
