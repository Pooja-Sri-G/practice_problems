package tasks.Day_1;


class Product{
	int p_id;
	String name;
	float price;
	int quantity;
	float total;
	Product(int p_id, String name, float price, int quantity){
		this.p_id = p_id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	void calculate(int discount) {

	    total = price * quantity;
	    total = total - (total * discount / 100);
	}
	
	void display() {
		System.out.println("Product ID = "+p_id);
		System.out.println("Product Name = "+name);
		System.out.println("Product price = "+price);
		System.out.println("Quanity = "+quantity);
		System.out.println("Total price of the product = "+total);
	}
}
public class ProductBillingSystem {

	public static void main(String[] args) {
		Product p1 = new Product(101,"Phone", 17000, 1);
		Product p2 = new Product(102,"Pen", 5, 5);
		Product p3 = new Product(103,"Note", 40, 2);
		Product p4 = new Product(104,"Laptop", 53000, 1);
		Product p5 = new Product(105,"Bag", 300, 1);
		
		p1.calculate(10);
		p1.display();
		

		p2.calculate(10);
		p2.display();
		p3.calculate(2);
		p3.display();
		p4.calculate(20);
		p4.display();
		p5.calculate(3);
		p5.display();
		
		float subtotal = p1.total + p2.total + p3.total + p4.total + p5.total;

		float gst = subtotal * 18 / 100;

		float finalAmount = subtotal + gst;

		System.out.println("Subtotal = " + subtotal);
		System.out.println("GST = " + gst);
		System.out.println("Final Bill = " + finalAmount);
		
		Product expensive = p1;

		if(p2.price > expensive.price) expensive = p2;
		if(p3.price > expensive.price) expensive = p3;
		if(p4.price > expensive.price) expensive = p4;
		if(p5.price > expensive.price) expensive = p5;

		System.out.println("Most expensive = " + expensive.name);
		
		Product cheap = p1;

		if(p2.price < cheap.price) cheap = p2;
		if(p3.price < cheap.price) cheap = p3;
		if(p4.price < cheap.price) cheap = p4;
		if(p5.price < cheap.price) cheap = p5;

		System.out.println("Cheapest = " + cheap.name);
		
		Product highestQty = p1;

		if(p2.quantity > highestQty.quantity) highestQty = p2;
		if(p3.quantity > highestQty.quantity) highestQty = p3;
		if(p4.quantity > highestQty.quantity) highestQty = p4;
		if(p5.quantity > highestQty.quantity) highestQty = p5;

		System.out.println("Highest quantity = " + highestQty.name);
		
		int totalItems = p1.quantity + p2.quantity + p3.quantity
	               + p4.quantity + p5.quantity;

	System.out.println("Total items = " + totalItems);
	
	
	}
}
