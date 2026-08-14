package day_5_tasks;

class Banks{
	
	int accountNumber;
	String accountHolderName;
	long mobileNumber;
	String accountType;
	double balance;
	String bankName;
	
	Banks(int accno, String name, long no, String type, double bal, String bname){
		accountNumber = accno;
		accountHolderName = name;
		mobileNumber = no;
		accountType = type;
		balance = bal;
		bankName = bname;
	}

	void display() {
		System.out.println("\nAccount Number = "+accountNumber);
		System.out.println("Account Holder Name = "+accountHolderName);
		System.out.println("Mobile Number = "+mobileNumber);
		System.out.println("Account Type = "+accountType);
		System.out.println("Balance = "+balance);
		System.out.println("Bank Name = "+bankName);
	}
}
public class SameNameRequirement {
	static String bankName = "Mariamman Indian Bank";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banks b1 = new Banks(001,"Arun",9876542318l,"Savings",87600,bankName);
		Banks b2 = new Banks(1003,"Uma",9876542312l,"Savings",70600,bankName);
		Banks b3 = new Banks(1002,"Kumar",9234567890l,"Savings",94000,bankName);
		
		b1.display();
		b2.display();
		b3.display();
	}

}
