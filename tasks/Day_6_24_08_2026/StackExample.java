package tasks.Day_6_24_08_2026;
import java.util.*;
class Employee{
	int id;
	String name;
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.print("Employee ID = "+id);
		System.out.print("Employee Name = "+name);
	}
}
public class StackExample {
	static void stackElements() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.push()\n2.pop()\n3.peek()\n4.isempty()\n5.size()\n6.display()\n-1.exit");
		Stack<Integer> stack = new Stack<>();
		while(true) {
			System.out.print("Enter your choice = ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter value = ");
				int value = sc.nextInt();
				stack.push(value);
				break;
			case 2:
				System.out.println(stack.pop());
				break;
			case 3:
				System.out.println(stack.peek());
				break;
			case 4:
				System.out.println(stack.isEmpty());
				break;
			case 5:
				System.out.println(stack.size());
				break;
			case 6:
				for(int i=stack.size()-1;i>=0;i--) {
					System.out.print(stack.get(i)+" ");
				}
				System.out.println();
				break;
			default:
				sc.close();
				return;
				
			}
		}
	}
	static String reverse(String s) {
		Stack<Character> charStack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			charStack.push(s.charAt(i));			
		}
		
		char[] arr = new char[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i] = charStack.pop();
		}
		return new String(arr);
		
	}
	static void stringStack() {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		String[] input = new String[n];
		System.out.println("Enter statement = ");
		for(int i=0;i<5;i++) {
			input[i] = sc.nextLine();
		}
		
		Stack<String> stack = new Stack<>();
		
		for(int i=0;i<n;i++) {
			stack.push(input[i]);
		}
		
		System.out.println();
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			String temp = stack.pop();
			System.out.print(temp+" ");
			arr[i] = reverse(temp);
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stackElements();
		//stringStack();
	}
}



