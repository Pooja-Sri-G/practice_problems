package day_5_tasks;

class CustomerAccounts{
	int accountNumber;
	String accountHolderName;
	long mobileNumber;
	String accountType;
	double balance;
	
	CustomerAccounts(int accno, String name, long no, String type, double bal){
		accountNumber = accno;
		accountHolderName = name;
		mobileNumber = no;
		accountType = type;
		balance = bal;
	}

	void withdraw(double amt) {

		if(amt < balance) {
			balance -= amt;
			System.out.println("Amount Withdrawn = "+amt);
			System.out.println("Account Balance = "+balance);
			
		}else {
			System.out.println("Insufficient Balance");
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
public class WithdrawOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerAccounts[] list = new CustomerAccounts[] {
				new CustomerAccounts(1001,"Arun",9876542318l,"Savings",87600),
				new CustomerAccounts(1002,"Kumar",9234567890l,"Savings",87600),
				new CustomerAccounts(1003,"Uma",9876542312l,"Savings",87600),
				
		};
		
		for(Object o: list){
			((CustomerAccounts)o).display();
		}
		
		list[0].withdraw(5000);
		list[0].display();
		
	}

}
