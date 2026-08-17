package tasks.Day_3;


class LoginSample{
	String username = "pooja";
	String password = "1234";
	
	void getter(String u, String p) {

		if(username.equals(u) && password.equals(p)) {
			System.out.println("Login successful");
		}else {
			throw new RuntimeException("Incorrect password or username");
		}
	}
	
	
}
class BankSample{
	double balance;
	
	BankSample(double balance){
		this.balance = balance;
	}
	
	void withdraw(double amt) {
		
		try {
			if(balance < amt) {
				throw new RuntimeException("Insufficient balance");
			}
			balance -= amt;
			System.out.println("Amount withdrawn. Balance = "+balance);
		}catch(Exception e) {
			System.out.println("Exception !!!!"+e);
		}finally {
			System.out.println("This is finally block. Amount = "+amt);
		}
	}
	
	@SuppressWarnings("null")
	void sample() 	{

		int a = 8;
		int b = 0;
		String str = null;
		int[] arr = new int[2];
		
		try {
			
			System.out.println("Division = "+(a/b));
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		
		
		
		try {
			System.out.println("Statement = "+str.charAt(3));
		}catch(NullPointerException e) {
			System.out.println("Null Pointer Exception occured");
			
		}
		
		try {
			System.out.println("Division = "+(a/b));
			System.out.println("Third element = "+arr[3]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot access element at position 3");
			
		}
		catch(Exception e) {
			System.out.println("Exception occured: "+ e);
		}
		
		try {
			System.out.println(a/b);
		}
		finally {
			System.out.println("this is finally block");
		}
		
		a = 10;
		if(a == 10) {
			throw new RuntimeException("a cannot be 10");
		}

	}
	
	void divide(int a, int b) throws ArithmeticException{
		System.out.println(a/b);
	}
	
	
}

class ProductSample{
	int price;
	
	ProductSample(int p){
		price = p;
	}
	
	void check() {
		if(price < 0) {
			throw new RuntimeException("");
		}
		if(price < 100) {
			
		}
	}
}
public class ExceptionSample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		BankSample b = new BankSample(8000);
		b.withdraw(10000);
		System.out.println();
		LoginSample l = new LoginSample();
		l.getter("pooja","1234");
		System.out.println();
		//l.getter("aaaa","1234");

		System.out.println();
		b.sample();
		System.out.println();
		b.divide(10,0);
		
	}

}
