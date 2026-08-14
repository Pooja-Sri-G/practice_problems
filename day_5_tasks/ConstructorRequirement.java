package day_5_tasks;

class BankAccounts{
	int accountNumber;
	String accountHolderName;
	long mobileNumber;
	String accountType;
	double balance;
	
	BankAccounts(int accno, String name, long no, String type, double bal){
		accountNumber = accno;
		accountHolderName = name;
		mobileNumber = no;
		accountType = type;
		balance = bal;
	}

	void display() {
		System.out.println("\nAccount Number = "+accountNumber);
		System.out.println("Account Holder Name = "+accountHolderName);
		System.out.println("Mobile Number = "+mobileNumber);
		System.out.println("Account Type = "+accountType);
		System.out.println("Balance = "+balance);
	}
}
public class ConstructorRequirement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccounts[] list = new BankAccounts[] {
				new BankAccounts(1001,"Arun",9876542318l,"Savings",87600),
				new BankAccounts(1002,"Kumar",9234567890l,"Savings",98000),
				new BankAccounts(1003,"Uma",9876542312l,"Savings",86900),
				
		};
		
		for(Object o: list){
			((BankAccounts)o).display();
		}
		
	}

}
