package tasks.Day_8;
import java.util.*;
class Student{
    String name;
    int rollno;
    float cgpa;
    
    Student(String n, int r, float c){
        name = n;
        rollno = r;
        cgpa = c;
    }    
    
    
}
public class Main
{
    static void basicHeap(){
         PriorityQueue<Integer> queue = new PriorityQueue<>(
	            (a,b) -> b - a //maxheap
	            // (a,b) -> a - b minheap
	            // default minheap
	        );
	    queue.offer(100);
	    queue.offer(20);
	    queue.offer(30);
	    queue.offer(10);
	    queue.offer(50);
	    queue.offer(60);
	    while(!queue.isEmpty()){
	        System.out.println(queue.poll());
	    }
    }
    
    static void classExample(){
        Student s1 = new Student("A",101,9.3f);
        Student s2 = new Student("E",105,8.7f);
        Student s3 = new Student("0",103,7.9f);
        Student s4 = new Student("a",104,9.7f);
        Student s5 = new Student("E",106,8.9f);
        Student s6 = new Student("E",103,8.9f);
        PriorityQueue<Student> queue = new PriorityQueue<>(
	            // (b,a) -> Float.compare(a.cgpa,b.cgpa)
	            // (a,b) -> a.name.compareTo(b.name)
	            (a,b) -> {
	                if(a.name.equals(b.name)){
	                    if(a.cgpa == b.cgpa){
	                        return Integer.compare(a.rollno, b.rollno);
	                    }
	                    return Float.compare(b.cgpa, a.cgpa);
	                }
	                
	                return a.name.compareTo(b.name);
	            }
	        );
	    queue.offer(s4);
	    queue.offer(s1);
	    queue.offer(s5);
	    queue.offer(s3);
	    queue.offer(s2);
	    queue.offer(s6);
        while(!queue.isEmpty()){
            Student curr = queue.poll();
	        System.out.println("Name = "+curr.name);
	        System.out.println("Roll No = "+curr.rollno);
	        System.out.println("CGPA = "+curr.cgpa);
	        
	    }
    }
	public static void main(String[] args) {
	   //basicHeap();
	   classExample();
	}
}
