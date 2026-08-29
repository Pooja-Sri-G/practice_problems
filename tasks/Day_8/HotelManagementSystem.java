package tasks.Day_8;
import java.util.*;

public class HotelManagementSystem {

	static Map<String, Integer> map = new TreeMap<>();  
	static void add(String s, int p) {
		map.put(s, p);
	}
	static void display() {
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	static int getMaxPrice() {
		int max = 0;
		for(int n:map.values()) {
			if (n>max) {
				max = n;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add("Idli", 15);
		add("Dosa", 30);
		add("Poori", 50);
		add("Chappathi", 40);
		add("Upma", 20);
		
		display();
		
		System.out.print("Max Price = "+getMaxPrice());
		
	}

}
