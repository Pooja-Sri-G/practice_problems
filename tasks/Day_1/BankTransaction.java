package tasks.Day_1;
class BankAccount{
	int acc_no;
	String name;
	String acc_type;
	double balance;
	
	BankAccount(int acc_no, String name, String acc_type, double balance){
		this.acc_no = acc_no;
		this.name = name;
		this.acc_type = acc_type;
		this.balance = balance;
	}
	void deposit(int amt) {
		balance += amt;
		System.out.println("Amount deposited = "+amt);
		System.out.println("Balance = "+balance);
		
	}
	
	void withdraw(int amt) {
		if(balance < amt) {
			System.out.println("Insufficient balance");
			
		}else {
			balance -= amt;
			System.out.println("Amount withdrawn = "+amt);
			System.out.println("Balance = "+balance);
		}
	}
	
	void display() {
		System.out.println("Account No = "+acc_no);
		System.out.println("Customer Name = "+name);
		System.out.println("Balance = "+balance);
		
	}
	
	void transfer(BankAccount b, int amt) {
		if(balance < amt) {
			System.out.println("Insufficient balance");
			
		}else {
			b.balance += amt;
		
			System.out.println("Amount transfered to account no "+b.acc_no+"= "+amt);
			balance -= amt;
		}
	}
	
}
public class BankTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount c1 = new BankAccount(1,"AAA","savings",90000);
		BankAccount c2 = new BankAccount(2,"BBB","current",85000);
		BankAccount c3 = new BankAccount(3,"CCC","savings",49000);
		
		
		c1.deposit(5000);
		c1.display();
		
		c2.withdraw(6000);
		c2.display();
				 
		c3.transfer(c2,8000);
		
		c1.display();
		c2.display();
		c3.display();
		
	}

}
