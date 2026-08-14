package day_5_tasks;

class Bankdetail{
	private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    
    Bankdetail(int accountNumber, double balance, String accountType){
    	this.accountNumber = accountNumber;
    	this.balance = balance;
    	this.accountType = accountType;
    }
    
    
    
    void setname(String name) {
    	accountHolderName = name;
    }
    
    void setMobile(String no) {
    	mobileNumber = no;
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
public class SettersRequirement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bankdetail b1 = new Bankdetail(1001,65000,"Savings");
		
		b1.setname("pooja");
		b1.setMobile("9876543210");
		
		b1.display();
		Bankdetail b2 = new Bankdetail(1002,56000,"Cuurent");
		
		b2.setname("sri");
		b2.setMobile("9876345210");
		b2.display();
		
		b1.deposit(7000);
		b2.withdraw(12000);
		
	}

}
