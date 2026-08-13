package classProblems;
class Students{
	int std_id;
	String std_name;
	int[] marks = new int[5];
	int total;
	int avg;
	char grade;
	
	Students(int std_id, String std_name, int[] marks) {
		this.std_id = std_id;
		this.std_name = std_name;
		this.marks = marks;
		
		
	}
	
	void calculate() {
		
		for(int i=0;i<5;i++) {
			total += marks[i];
			
		}
		
		avg = total/5;
	}
	
	void calculateGrade() {
		if(avg > 90) {
			grade = 'O';
		}else if(avg > 80) {
			grade = 'A';
		}else if(avg > 70) {
			grade = 'B';
		}else if(avg > 60) {
			grade = 'C';
		}else {
			grade = 'F';
		}
	}
	void display(){
		System.out.println("\nStudent ID = "+std_id);
		System.out.println("Student Name = "+std_name);
		System.out.println("Total marks = "+total);
		System.out.println("Average = "+avg);
		System.out.println("Grade = "+grade);
		
		
	}
}
public class StudentResult {

	public static void main(String[] args) {
		
		 Students s1 = new Students(101, "AAA", new int[]{90, 99, 98, 80, 89});
	        Students s2 = new Students(102, "BBB", new int[]{75, 82, 68, 90, 77});
	        Students s3 = new Students(103, "CCC", new int[]{55, 60, 45, 70, 62});
	        Students s4 = new Students(104, "DDD", new int[]{95, 92, 96, 94, 98});
	        Students s5 = new Students(105, "EEE", new int[]{40, 50, 35, 60, 45});
	        
	        s1.calculate(); s1.calculateGrade();
	        s2.calculate(); s2.calculateGrade();
	        s3.calculate(); s3.calculateGrade();
	        s4.calculate(); s4.calculateGrade();
	        s5.calculate(); s5.calculateGrade();
	        
	        System.out.println("RESULTS:");
	        s1.display();
	        s2.display();
	        s3.display();
	        s4.display();
	        s5.display();
	        
	        float classAvg = (s1.avg+s2.avg+s3.avg+s4.avg+s5.avg)/5;
	        
	        Students highest = s1;
	        if (s2.total > highest.total) highest = s2;
	        if (s3.total > highest.total) highest = s3;
	        if (s4.total > highest.total) highest = s4;
	        if (s5.total > highest.total) highest = s5;

	        Students lowest = s1;
	        if (s2.total < lowest.total) lowest = s2;
	        if (s3.total < lowest.total) lowest = s3;
	        if (s4.total < lowest.total) lowest = s4;
	        if (s5.total < lowest.total) lowest = s5;
	        
	        System.out.println("\nClass Average: " + classAvg);
	        System.out.println("Highest Scorer: " + highest.std_name + " Total: " + highest.total);
	        System.out.println("Lowest Scorer: " + lowest.std_name + " Total: " + lowest.total);
		
	}
	
}
