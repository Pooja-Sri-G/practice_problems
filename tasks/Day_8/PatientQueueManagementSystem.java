package practice_programs;
import java.util.*;

class PatientDetails{
	String name;
	int severity;
	int arrival_time;
	int age;
	PatientDetails(String n, int s, int t, int a){
		name = n;
		severity = s;
		arrival_time = t;
		age = a;
		
	}
	void display() {
		System.out.println("Patient name = "+name);
		System.out.println("Severity = "+severity);
		System.out.println("Arrival time = "+arrival_time);
		System.out.println("Patient age = "+age);
	}
	
}
public class PatientQueueManagementSystem {

	static PriorityQueue<PatientDetails> queue = new PriorityQueue<>(
			(a,b) -> {
	            if (a.severity != b.severity) {
	                return Integer.compare(b.severity, a.severity);
	            }

	            if (a.arrival_time != b.arrival_time) {
	                return Integer.compare(b.arrival_time, a.arrival_time);
	            }

	            boolean p1PriorityAge = a.age < 12 || a.age > 65;
	            boolean p2PriorityAge = b.age < 12 || b.age > 65;

	            if (p1PriorityAge != p2PriorityAge) {
	                return p1PriorityAge ? -1 : 1;
	            }

	            return a.name.compareTo(b.name);
			}
		);
	

	static void add_patient(PatientDetails e) {
		queue.offer(e);
	}
	
	static PatientDetails treat_next() {
		return queue.poll();
	}
	
	static PatientDetails peek_next() {
		return queue.peek();
	}
	static void displayAll() {

		while(!queue.isEmpty()) {
			treat_next().display();
		}
		
	}
	static void update_severity(String name, int new_severity) {
	    for (PatientDetails p : queue) {
	        if (p.name.equals(name)) {
	            queue.remove(p);
	            p.severity = new_severity;
	            queue.offer(p);
	            return;
	        }
	    }

	    System.out.println("Patient not found.");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*PatientDetails p1 = new PatientDetails("AAA", 3, 10, 57);
		PatientDetails p2 = new PatientDetails("BBB", 4, 20, 57);
		PatientDetails p3 = new PatientDetails("CCC", 2, 40, 57);
		PatientDetails p4 = new PatientDetails("DDD", 5, 10, 57);
		PatientDetails p5 = new PatientDetails("EEE", 1, 20, 57);
		*/
		
		Scanner sc = new Scanner(System.in);
		add_patient(new PatientDetails("AAA", 3, 10, 57));
		add_patient(new PatientDetails("BBB", 4, 20, 11));
		add_patient(new PatientDetails("CCC", 5, 40, 24));
		add_patient(new PatientDetails("DDD", 5, 30, 36));
		add_patient(new PatientDetails("EEE", 1, 20, 42));
		int ch;
		System.out.println("1.Treat next\n2.Peek next\n3.Display All\n4.Update severity");
		while(true) {
			System.out.print("Enter your choice = ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				treat_next().display();
				break;
			case 2:
				peek_next().display();
				break;
			case 3:
				displayAll();
				break;
			case 4:
				System.out.print("Enter patient name = ");
				String name = sc.nextLine();
				System.out.print("Enter patient severity = ");
				int sev = sc.nextInt();
				
				update_severity(name,sev);
			default:
				return;
			}
		}

	}

}
