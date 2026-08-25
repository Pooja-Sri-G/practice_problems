package tasks.Day_6_24_08_2026;
import java.util.*;
public class StockPriceAlertSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //int prices[] = new int[n];
        int n = 7;
        int []prices = {100,80,60,70,60,75,85};
        /*for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }*/
        Stack<Integer> stack = new Stack<>();
        int[] freq = new int[n];
        Arrays.fill(freq, 1);
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && prices[i]>prices[stack.peek()]){
                int temp = stack.pop();
                freq[i] = i-temp+1;
            }
            stack.push(i);
        }
       
        for(int i=0;i<n;i++){
            System.out.print(freq[i]+" ");
        }
    }
}
