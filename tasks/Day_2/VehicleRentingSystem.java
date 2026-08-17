package tasks.Day_2;
import java.util.*;
abstract class Vehicle{
	int no;
	String brand;
	int baseRate;
	
	Vehicle(int no, String brand, int baseRate){
		this.no = no;
		this.brand = brand;
		this.baseRate = baseRate;
	}
	abstract int calculateRentalCost();
	
	void displayDetails() {
		System.out.println("Vehicle Number = "+no);
		System.out.println("Vehicle Brand = "+brand);
		System.out.println("BaseRate = "+baseRate);
		System.out.println("Rental Cost = "+calculateRentalCost());
	}
}

interface Insurable{
	float getInsuranceCost();
}
class Car extends Vehicle implements Insurable{
	Car(int no, String brand, int baseRate) {
		super(no, brand, baseRate);
	}

	int calculateRentalCost() {
		int total = baseRate+((baseRate/100)*3);
		return total;
	}
	
	public float getInsuranceCost() {
		return (baseRate/100)*3;
	}
}

class Bike extends Vehicle{
	Bike(int no, String brand, int baseRate) {
		super(no, brand, baseRate);
		// TODO Auto-generated constructor stub
	}

	int calculateRentalCost() {
		int total = baseRate+((baseRate/100)*2);
		return total;
	}
}

class Truck extends Vehicle implements Insurable{
	Truck(int no, String brand, int baseRate) {
		super(no, brand, baseRate);
		// TODO Auto-generated constructor stub
	}

	int calculateRentalCost() {
		int total = baseRate+((baseRate/100)*4);
		return total;
	}
	
	public float getInsuranceCost(){
		return (baseRate/100)*4;
	}
}

class RentalAgency{
	
	List<Vehicle> list = new ArrayList<>();
	
	void addVehicle(Vehicle v) {
		list.add(v);
	}
	
	void display() {
		for(Vehicle v: list) {
			v.displayDetails();
		}
	}
	
	void bill(Vehicle v) {
		System.out.println("Rental amount total = "+v.calculateRentalCost());
		
		if(v instanceof Insurable) {
			System.out.println("Insurance cost = "+((Insurable)v).getInsuranceCost());
		}else {
			System.out.println("There is no insurace cost for bike");
		}
	}
	
}
public class VehicleRentingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Car c = new Car(1403, "Audi", 5600);
		Bike b = new Bike(4130, "Honda", 1400);
		Truck t = new Truck(3014, "Volkswagen", 7800);
		
		RentalAgency ra = new RentalAgency();
		
		ra.addVehicle(c);
		ra.addVehicle(b);
		ra.addVehicle(t);
		
		ra.bill(c);
		ra.bill(b);
		ra.bill(t);
		
	}

}
