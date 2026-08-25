package tasks.Day_6_24_08_2026;
import java.util.*;
public class UndoRedoSystem {
    static void display(Stack<String> stack){
        for(int i=0;i<stack.size();i++){
            System.out.print(stack.get(i)+" ");

        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1.type()\n2.undo()\n3.redo()");
        Stack<String> stackUndo = new Stack<>();
        Stack<String> stackRedo = new Stack<>();
        while(true){
            System.out.print("Enter choice = ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:
                    System.out.print("Enter text = ");
                    String text = sc.nextLine();
                    stackUndo.push(text);
                    display(stackUndo);
                    break;
                case 2:
                    if(!stackUndo.isEmpty()){
                        stackRedo.push(stackUndo.pop());
                    }
                    display(stackUndo);
                    break;
                case 3:
                    if(!stackRedo.isEmpty()){
                        stackUndo.push(stackRedo.pop());
                    }
                    display(stackUndo);
                    break;
                default:
                    return;

            }
        }


    }
}
