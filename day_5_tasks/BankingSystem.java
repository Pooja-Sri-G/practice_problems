package day_5_tasks;

class InvalidAmountException extends RuntimeException{
	InvalidAmountException(String err){
		super(err);
	}
}
class BankingDetails{
	int accountNumber;
	String accountHolderName;
	long mobileNumber;
	String accountType;
	double balance;
	
	BankingDetails(int accno, String name, long no, String type, double bal){
		accountNumber = accno;
		accountHolderName = name;
		mobileNumber = no;
		accountType = type;
		balance = bal;
	}
	
	void deposit(double amt) {
		try {
			if(amt < 0) {
				throw new InvalidAmountException("Negative amount cannot be deposited");
			}
		}catch(Exception e) {
			System.out.println("\n"+e);
		}
		balance += amt;
		System.out.println("\nAmount deposited = "+amt);
		System.out.println("Account Balance = "+balance);
	}

	void withdraw(double amt) {
		
		try {
			if(amt < 0) {
				throw new InvalidAmountException("Negative amount cannot be withdrawn");
			}
			if(amt > balance) {
				throw new InvalidAmountException("Insufficient Balance");
			}
		}catch(Exception e) {
			System.out.println("\n"+e);
		}
		if(amt < balance) {
			balance -= amt;
			System.out.println("\nAmount Withdrawn = "+amt);
			System.out.println("Account Balance = "+balance);
			
		}
		
	}

	void display() {
		System.out.println("\nAccount Number = "+accountNumber);
		System.out.println("Account Holder Name = "+accountHolderName);
		System.out.println("Mobile Number = "+mobileNumber);
		System.out.println("Account Type = "+accountType);
		System.out.println("Balance = "+balance);
	}
}
public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankingDetails a1 = new BankingDetails(1001,"Arun",9876542318l,"Savings",87600);
		BankingDetails a2 =	new BankingDetails(1002,"Kumar",9234567890l,"Savings",98000);
		
		a1.display();
		
		a1.deposit(5000);
		a1.withdraw(3000);
		
		a1.mobileNumber = 9999999999l;


		System.out.println("\nChanged Mobile Number = "+a1.mobileNumber);
		
		a1.deposit(-4500);
		a1.withdraw(-7800);
		a1.withdraw(100000);
		a2.display();
		a2.deposit(10000);
		a2.withdraw(5000);
		a2.display();
		
				

		
	}

}
