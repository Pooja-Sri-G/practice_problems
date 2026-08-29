package tasks.Day_10;

interface A{
    void display1();
    void display2();
}

@FunctionalInterface
interface B{
    void display3();
    default void display4()
    {
        System.out.println("Display 4");
        display5();
    }

    static void display5(){
        System.out.println("Display 5");
    }

}
@FunctionalInterface
interface Animals{
    void disp(String name);
}

@FunctionalInterface
interface Multiplication{
    void multiple(int a, int b);
    default int product(int a, int b){
        return a*b;
    }
}
public class InterfaceInitialisation {
    public static void main(String[] args) {
        A a = new A(){ //anonymous class creation
            @Override
            public void display1(){
                System.out.println("Hello");
            }

            @Override
            public void display2(){
                System.out.println("World");
            }
        };

        a.display1();
        a.display2();

        B b = ()->System.out.println("Java");
        b.display3();
        b.display4();
        Animals dog = (String name)->{
            System.out.println("Animal name = "+name);
        };
        dog.disp("Dog");

        Multiplication m = (int num1, int num2)->{
            System.out.println("Product = "+(num1*num2));
        };
        m.multiple(5,6);
        System.out.println("Product = "+m.product(5,6));
        
    }
}
