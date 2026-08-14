package day_5_tasks;

class CustomerAccount{
	int accountNumber;
	String accountHolderName;
	long mobileNumber;
	String accountType;
	double balance;
	
	CustomerAccount(int accno, String name, long no, String type, double bal){
		accountNumber = accno;
		accountHolderName = name;
		mobileNumber = no;
		accountType = type;
		balance = bal;
	}

	void deposit(double amt) {
		balance += amt;
		System.out.println("Amount deposited = "+amt);
		System.out.println("Account Balance = "+balance);
	}
	void display() {
		System.out.println("\nAccount Number = "+accountNumber);
		System.out.println("Account Holder Name = "+accountHolderName);
		System.out.println("Mobile Number = "+mobileNumber);
		System.out.println("Account Type = "+accountType);
		System.out.println("Balance = "+balance);
	}
}
public class DepositOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerAccount[] list = new CustomerAccount[] {
				new CustomerAccount(1001,"Arun",9876542318l,"Savings",87600),
				new CustomerAccount(1002,"Kumar",9234567890l,"Savings",87600),
				new CustomerAccount(1003,"Uma",9876542312l,"Savings",87600),
				
		};
		
		for(Object o: list){
			((CustomerAccount)o).display();
		}
		
		list[0].deposit(5000);
		list[0].display();
		
	}

}
