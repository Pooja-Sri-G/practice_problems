package tasks.Day_7;
import java.util.*;

public class QueueSample {
    static void binaryGeneration(){
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("1");
        int n = 10;

        while(n-- > 0){
            String temp = queue.poll();
            System.out.println(temp);
            queue.offer(temp+"0");
            queue.offer(temp+"1");
        }
    }
    public static void main(String[] args){
        
        binaryGeneration();
    }
}
