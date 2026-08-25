package tasks.Day_7;
import java.util.*;
public class ExpressionConvertion {
    static int precedence(char c){
        if(c == '^'){
            return 3;
        }
        else if(c == '*' || c == '/' || c == '%'){
            return 2;
        }
        else if(c == '+' || c == '-'){
            return 1;
        }
        return 0;

    }
    static StringBuilder postfixConversion(String str){
        
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c:str.toCharArray()){
            if(Character.isLetter(c)){
                result.append(c);
            }
            else if(c == '('){
                stack.push(c);
            }
            else if(c == ')'){
                // do not add close paranthesis 
                while(!stack.isEmpty() && stack.peek() != '('){
                    result.append(stack.pop());
                }
                stack.pop(); // pop open paranthesis
            }
            else{
                while(!stack.isEmpty() && (precedence(stack.peek()) >= precedence(c))){
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        return result;
    }
    static StringBuilder prefixConversion(String str){

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i) == '('){
                sb.setCharAt(i, ')');
            }
            else if(sb.charAt(i) == ')'){
                sb.setCharAt(i,'(');
            }
        }
        StringBuilder result = postfixConversion(sb.toString());
        result.reverse();
        return result;
    }
    public static void main(String[] args){
        String str = "a*b+(c-d)/e%f";
        System.out.println("Postfix = "+postfixConversion(str));
        System.out.println("Prefix = "+prefixConversion(str));
    }
}
