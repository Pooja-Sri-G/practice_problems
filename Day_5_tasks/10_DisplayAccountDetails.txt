package day_5_tasks;

class Bankdetails{
	int accountNumber;
	String accountHolderName;
	long mobileNumber;
	String accountType;
	double balance;
	
	Bankdetails(int accno, String name, long no, String type, double bal){
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
public class DisplayAccountDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bankdetails[] list = new Bankdetails[] {
				new Bankdetails(1001,"Arun",9876542318l,"Savings",87600),
				new Bankdetails(1002,"Kumar",9234567890l,"Savings",87600),
				new Bankdetails(1003,"Uma",9876542312l,"Savings",87600),
				
		};
		
		System.out.println("=======================================\nMARIAMMAN INDIAN BANK\n========================================");
		for(Object o: list){
			((Bankdetails)o).display();
		}
		
	}

}
