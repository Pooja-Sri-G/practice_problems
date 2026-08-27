package practice_programs;

import java.util.*;

public class HotelManagementSystem {

	static Map<String, Float> map = new TreeMap<>();  
	static void add(String s, float p) {
		map.put(s, p);
	}
	static void display() {
		for(Map.Entry<String, Float> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add("Idli", 15);
		add("Dosa", 30);
		add("Poori", 50);
		add("Chappathi", 40);
		add("Upma", 20);
		
		display();
		
	}

}
