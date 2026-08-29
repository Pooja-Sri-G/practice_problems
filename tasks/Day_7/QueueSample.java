package tasks.Day_7;
import java.util.*;
class PrinterSample1{
    String name;
    String document;
    PrinterSample1(String name, String document){
        this.name = name;
        this.document = document;
    }
    void print(){
        System.out.println(name+" Document = "+document);
    }
}

public class QueueSample {
    static void binaryGeneration(){
        Queue<String> queue = new LinkedList<>();
        System.out.println("0");
        queue.offer("1");
        int n = 10;

        while(n-- > 0){
            String temp = queue.poll();
            System.out.println(temp);
            queue.offer(temp+"0");
            queue.offer(temp+"1");
        }
    }
    
    static void printer(){
        Scanner sc = new Scanner(System.in);
        int n=5;
        Queue<PrinterSample1> queue= new LinkedList<>();
        PrinterSample1 p1 = new PrinterSample1("printer1 = Xerox", "word");
        PrinterSample1 p2 = new PrinterSample1("printer2 = HP", "pdf");
        PrinterSample1 p3 = new PrinterSample1("printer3 = CANON", "docs");
        PrinterSample1 p4 = new PrinterSample1("printer4 = EPSON", "docx");     
        PrinterSample1 p5 = new PrinterSample1("printer5 = BROTHER", "img");
        for(int i=0;i<n;i++){
            String ch = sc.nextLine();
            switch(ch){
                case "p1":
                    if(!queue.contains(p1)){
                        queue.offer(p1);
                    }else{
                        System.out.println("Printer has already been assigned.");
                    }
                    
                    break;
                
                case "p2":
                    if(!queue.contains(p2)){
                        queue.offer(p2);
                    }else{
                        System.out.println("Printer has already been assigned.");
                    }
                    break;
                
                case "p3":
                    if(!queue.contains(p3)){
                        queue.offer(p3);
                    }else{
                        System.out.println("Printer has already been assigned.");
                    }
                    break;
                
                case "p4":
                    if(!queue.contains(p4)){
                        queue.offer(p4);
                    }else{
                        System.out.println("Printer has already been assigned.");
                    }
                    break;
                
                case "p5":
                    if(!queue.contains(p5)){
                        queue.offer(p5);
                    }else{
                        System.out.println("Printer has already been assigned.");
                    }
                    break;
                
            }
        }
        while(!queue.isEmpty()){
            queue.poll().print();
        }
    }
    public static void main(String[] args){
        
        //binaryGeneration();
        printer();
    }
}
