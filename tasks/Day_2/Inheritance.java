package tasks.Day_2;

class Person{
	String name = "AAA";
	String work = "Study";

	void activity() {
		System.out.println("Hello "+name);
	}
}

class Student extends Person{
	char grade = 'O';
	int subjects = 5;
	void activity() {
		super.activity();
		System.out.println("Student Name = "+name);
		System.out.println("Student Grade = "+grade);
		System.out.println("No of Subjects = "+subjects);
		
	}
}

class Child extends Student{
	String p = "BBB";
	void activity() {
		super.activity();
		System.out.println("Child Name = "+name);
		System.out.println("Parent Name = "+p);
		
	}
}

class Customer extends Child{
	String product = "Phone";
	void activity() {
		super.activity();
		System.out.println("Name of Product = "+product);
	}
}

class Visitor extends Customer{
	String place = "Red Fort";
	void activity() {
		super.activity();
		System.out.println("Name of Place = "+place);
		
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Visitor v = new Visitor();
		v.activity();
	}

}
