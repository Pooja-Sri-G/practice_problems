package day_5_tasks;

class BankAccount{
	private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    
    void setAccNo(int accno) {
    	accountNumber = accno;
    }
    
    void setname(String name) {
    	accountHolderName = name;
    }
    
    void setMobile(String no) {
    	mobileNumber = no;
    }
    
    void setType(String type) {
    	accountType= type;
    }
    
    void setBalance(double bal) {
    	balance = bal;
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
public class DataSecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount b1 = new BankAccount();
		
		b1.setAccNo(108);
		b1.setname("pooja");
		b1.setMobile("9876543210");
		b1.setType("Savings");
		b1.setBalance(987000);
		
		System.out.println("Account Holder Name = "+b1.getname());
		System.out.println("Account Number = "+b1.getAccNo());
		System.out.println("Mobile Number = "+b1.getMobile());
		System.out.println("Account Type = "+b1.getType());
		System.out.println("Balance = "+b1.getBalance());
		
BankAccount b2 = new BankAccount();
		
		b2.setAccNo(109);
		b2.setname("sri");
		b2.setMobile("9876345210");
		b2.setType("Current");
		b2.setBalance(867000);
		
		System.out.println("\nAccount Holder Name = "+b2.getname());
		System.out.println("Account Number = "+b2.getAccNo());
		System.out.println("Mobile Number = "+b2.getMobile());
		System.out.println("Account Type = "+b2.getType());
		System.out.println("Balance = "+b2.getBalance());
		
		
	}

}
