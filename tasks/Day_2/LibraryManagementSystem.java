package classProblems;
import java.util.*;
abstract class LibraryItem{
	String title;
	int itemID;
	boolean isAvailable;

	LibraryItem(String title, int itemID){
		this.title = title;
		this.itemID = itemID;
		isAvailable = true;
	}
	abstract int getLoanPeriod();
	
	void displayDetails() {
		
		System.out.println("Title = "+title);
		System.out.println("ID = "+itemID);
		System.out.println("Availability = "+isAvailable);
		System.out.println("Loan Period = "+getLoanPeriod());
		
	}
	
}

interface Borrowable {
	void borrowItem();
	void returnItem();
}

class Book extends LibraryItem implements Borrowable{
	
	Book(String t, int i){
		super(t, i);
	}
	
	int getLoanPeriod() {
		return 14;
	}
	
	public void borrowItem() {
		if(isAvailable) {
			System.out.println("Borrowed book ID = "+itemID);
			isAvailable = false;
		}else {
			System.out.println("Book unavailable");
		}
	}
	public void returnItem() {
		isAvailable = true;
		System.out.println("Book has been returned.");
	}
}

class Magazine extends LibraryItem{
	Magazine(String t, int i){
		super(t, i);
	}
	
	int getLoanPeriod() {
		return 0;
	}
}

class DVD extends LibraryItem implements Borrowable{
	DVD(String t, int i){
		super(t, i);
	}
	
	int getLoanPeriod() {
		return 5;
	}


	public void borrowItem() {
		if(isAvailable) {
			System.out.println("Borrowed DVD ID = "+itemID);
			isAvailable = false;
		}else {
			System.out.println("DVD unavailable");
		}
	}
	public void returnItem() {
		isAvailable = true;
		System.out.println("DVD has been returned.");
	}
}

class Librarian {
	List<LibraryItem> list = new ArrayList<>();
	
	void addItem(LibraryItem l) {
		list.add(l);
	}
	
	void display() {
		
		for(LibraryItem item: list)
		{
			item.displayDetails();
		}
	}
	
	void borrowItem(LibraryItem l) {
		if(l instanceof Borrowable) {
			((Borrowable)l).borrowItem();
		}else {
			System.out.println("Magazine cannot be borrowed");
		}
	}
}
public class LibraryManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Librarian l = new Librarian();
		
		Book b = new Book("AAA", 101);
		DVD d = new DVD("BBB",102);
		Magazine m = new Magazine("CCC",103);
		
		l.addItem(b);
		l.addItem(d);
		l.addItem(m);


		l.borrowItem(b);
		l.borrowItem(d);
		l.borrowItem(m);
		
		
		l.display();
		
		
	}

}
