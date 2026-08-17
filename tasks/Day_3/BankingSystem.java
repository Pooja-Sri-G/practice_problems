package tasks.Day_3;

abstract class BankAccountss{
	private int accno;
	private String name;
	private double balance;
	
	BankAccountss(int accountNumber, String holderName, double balance) {
        this.accno = accountNumber;
        this.name = holderName;
        this.balance = balance;
    }
    double getBalance() {
        return balance;
    }
    
    void setBalance(double amount) {
    	balance = amount;
    }
	
	void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: ₹" + amount);
		
	}
	
	
	abstract void withdraw(double amount);
	
	void display() {
		System.out.println("Account Number = "+accno);
		System.out.println("Account Holder = "+name);
		System.out.println("Balance = "+balance);
		
	}
	
}

class SavingsAccount extends BankAccountss{

	SavingsAccount(int accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
		// TODO Auto-generated constructor stub
	}

	void withdraw(double amount) {
		if((getBalance() - amount) >=1000){
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful.");
			
		}else {
			System.out.println("Insufficient Balance");
		}
		
	}
	
	
	
}

class CurrentAccount extends BankAccountss{

	CurrentAccount(int accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
		// TODO Auto-generated constructor stub
	}

	void withdraw(double amount) {

		if((getBalance() - amount) >= 5000){
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful.");
			
		}else {
			System.out.println("Insufficient Balance");
		}
		
	}
}
public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount s = new SavingsAccount(108,"pooja", 85000);
		
		
		CurrentAccount c = new CurrentAccount(109, "sri",60000);

		s.deposit(5000);
		c.deposit(7800);

		
		s.withdraw(60000);
		
		c.withdraw(70000);
		c.display();
		s.display();
		
	}

}
