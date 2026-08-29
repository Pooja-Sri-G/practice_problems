package tasks.Day_10;

import java.util.Scanner;

@FunctionalInterface
interface Square{
    void calculate_area(int a);
}

@FunctionalInterface
interface Rectangle{
    void calculate_area(int l, int b);
}

@FunctionalInterface
interface Circle{
    void calculate_area(long r);
}

@FunctionalInterface
interface Triangle{
    void calculate_area(float half, int h, int b);
}

public class CalculateAreaUsingInterface {
    public static void main(String[] args){
        System.out.println("1.Square\n2.Rectangle\n3.Circle\n4.Triangle");
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println();
            System.out.print("Enter your choice = ");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter side = ");
                    int side = sc.nextInt();
                    Square s = (int a)->{
                        System.out.println("Area of Square = "+(a*a));
                    };

                    s.calculate_area(side);
                    break;
                case 2:
                    System.out.print("Enter length = ");
                    int length = sc.nextInt();
                    System.out.print("Enter breadth = ");
                    int breadth = sc.nextInt();
                    Rectangle r = (int l, int b)->{
                        System.out.println("Area of Rectangle = "+(l*b));
                    };

                    r.calculate_area(length, breadth);
                    break;

                case 3:
                    System.out.print("Enter radius = ");
                    long radius = sc.nextInt();
                    Circle c = (long rad)->{
                        System.out.println("Area of Rectangle = "+(3.14*rad*rad));
                    };

                    c.calculate_area(radius);
                    break;

                case 4:
                    System.out.print("Enter height = ");
                    int height = sc.nextInt();
                    System.out.print("Enter base = ");
                    int base = sc.nextInt();
                    Triangle t = (float half,int h, int b)->{
                        System.out.println("Area of Triangle = "+(half*h*b));
                    };

                    t.calculate_area(0.5f,height,base);
                    break;
                default:
                    sc.close();
                    return;


            }
        }
    }
}
