package tasks.Day_4;

import java.util.Arrays;
import java.util.LinkedList;

class color1{
	int id;
	String name;
	
	color1(int id, String name){
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println("Color ID = "+id);
		System.out.println("Color Name = "+name);
		
	}
}

class color2{
	int id;
	String name;
	
	color2(int id, String name){
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println("Color ID = "+id);
		System.out.println("Color Name = "+name);
		
	}
}

class color3{
	int id;
	String name;
	
	color3(int id, String name){
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println("Color ID = "+id);
		System.out.println("Color Name = "+name);
		
	}
}

class color4{
	int id;
	String name;
	
	color4(int id, String name){
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println("Color ID = "+id);
		System.out.println("Color Name = "+name);
		
	}
}

class color5{
	int id;
	String name;
	
	color5(int id, String name){
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println("Color ID = "+id);
		System.out.println("Color Name = "+name);
		
	}
}

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Object> list = new LinkedList<>(
				Arrays.asList(
						new color1(101,"black"),
						new color2(102,"white"),
						new color3(103, "yellow"),
						new color4(104,"blue"),
						new color5(105,"red")
						));
		/*
		list.add(new color1(101,"black"));
		list.add(new color2(102,"white"));
		list.add(new color3(103, "yellow"));
		list.add(new color4(104,"blue"));
		list.add(new color5(105,"red"));
		*/
		

		
		for(Object obj:list) {
			if (obj instanceof color1) {
		        ((color1) obj).display();
		    } else if (obj instanceof color2) {
		        ((color2) obj).display();
		    } else if (obj instanceof color3) {
		        ((color3) obj).display();
		    } else if (obj instanceof color4) {
		        ((color4) obj).display();
		    } else if (obj instanceof color5) {
		        ((color5) obj).display();
		    }
		}
		
		
	}

}
