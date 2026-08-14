package day_5_tasks;

class BankDetail{
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
    
    void display() {
		System.out.println("\nAccount Number = "+accountNumber);
		System.out.println("Account Holder Name = "+accountHolderName);
		System.out.println("Mobile Number = "+mobileNumber);
		System.out.println("Account Type = "+accountType);
		System.out.println("Balance = "+balance);
	}
    
    
}
public class SetterRequirement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankDetail b1 = new BankDetail();
		
		b1.setAccNo(108);
		b1.setname("pooja");
		b1.setMobile("9876543210");
		b1.setType("Savings");
		b1.setBalance(987000);
		
		b1.display();
		BankDetail b2 = new BankDetail();
		
		b2.setAccNo(109);
		b2.setname("sri");
		b2.setMobile("9876345210");
		b2.setType("Current");
		b2.setBalance(867000);
		b2.display();
		
		
	}

}
