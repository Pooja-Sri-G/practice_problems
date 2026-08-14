package tasks.Day_5;
import java.util.*;
class Customers{
	String id;
	int amount;
	int discount;
	
	Customers(String id, int amount, int discount){
		this.id = id;
		this.amount = amount;
		this.discount = discount;
	}
	
	void display() {
		System.out.println("Customer ID = "+id);
		System.out.println("Amount = "+amount);
		System.out.println("Discount = "+discount);
		
	}
}
public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Customers> list = new LinkedList<>(
			Arrays.asList(
					new Customers("101",800,10),
					new Customers("102", 900,20),
					new Customers("103",100,2)
				));
		System.out.println("Ascending order:\n");
		
		ListIterator<Customers> itr2 = list.listIterator();
		
		while(itr2.hasNext()) {
			itr2.next().display();
		}
		
		System.out.println("\nDescending order:\n");

		Iterator<Customers> itr = list.descendingIterator();
		
		while(itr.hasNext()) {
			itr.next().display();
		}

	}

}
