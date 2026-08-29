package tasks.Day_9;

class OrderProcessing extends Thread {

    public void run() {
        for (int i=1;i<=5;i++) {
            System.out.println("Order " + i + " is being processed");

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class Kitchen extends Thread {

    public void run() {
        for (int i=1;i<=5;i++) {
            System.out.println("Kitchen is preparing Order " + i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class Delivery extends Thread {

    public void run() {
        for (int i=1;i<=5;i++) {
            System.out.println("Order " + i + " is out for delivery");

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {

        OrderProcessing t1 = new OrderProcessing();
        Kitchen t2 = new Kitchen();
        Delivery t3 = new Delivery();

        t1.start();
        t2.start();
        t3.start();
    }
}
