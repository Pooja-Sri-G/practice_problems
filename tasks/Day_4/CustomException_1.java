package tasks.Day_4;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}
	
}

class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String str) {
		super(str);
	}
}



class Bank_Account{
	double balance;
	Bank_Account(double bal){
		balance = bal;
	}
	
	void withdraw(double amt) throws InsufficientBalanceException{
		if(balance > amt) {
			balance -= amt;
			System.out.println("Withdrawal successful");
		}else {
			throw new InsufficientBalanceException("Insufficient Bank Balance");
		}
	}
}


public class CustomException_1 {

	static void check(int age) throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("You are not eligible to vote");
		}else {
			System.out.println("You are eligible to vote");
		}
	}
	static void cust_exception () {


		try {
			check(19);
			check(15);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		System.out.println("end of the program");
	}
	static void bank()  throws InsufficientBalanceException{
		Bank_Account b = new Bank_Account(6000);
		//b.withdraw(5000);
		b.withdraw(4000);
		try {

			b.withdraw(5000);
			b.withdraw(4000);
		}catch (InsufficientBalanceException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
		check(16);
		cust_exception();
		bank();
		
	}

}
