package day_5_tasks;

class BankDetails{
	private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
        
    BankDetails(int accountNumber, String accountHolderName, String mobileNumber, String accountType, double balance){
    	this.accountNumber = accountNumber;
    	this.accountHolderName = accountHolderName;
    	this.mobileNumber = mobileNumber;
    	this.accountType = accountType;
    	this.balance = balance;
    }

    int getAccNo() {
    	return accountNumber;
    }
    
    String getname() {
    	return accountHolderName;
    }
    
    String getMobile() {
    	 return mobileNumber;
    }
    
    String getType() {
    	return accountType;
    }
    
    double getBalance() {
    	return balance;
    }
    

    
}
public class GetterRequirement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankDetails b1 = new BankDetails(108,"pooja","9876543210","Savings",98000);
		BankDetails b2 = new BankDetails(109,"sri","8765432190","Current",67000);

		System.out.println("Account Holder Name = "+b1.getname());
		System.out.println("Account Number = "+b1.getAccNo());
		System.out.println("Mobile Number = "+b1.getMobile());
		System.out.println("Account Type = "+b1.getType());
		System.out.println("Balance = "+b1.getBalance());


		System.out.println("\nAccount Holder Name = "+b2.getname());
		System.out.println("Account Number = "+b2.getAccNo());
		System.out.println("Mobile Number = "+b2.getMobile());
		System.out.println("Account Type = "+b2.getType());
		System.out.println("Balance = "+b2.getBalance());
		
	}

}
