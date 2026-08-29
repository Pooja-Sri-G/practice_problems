package tasks.Day_9;

import java.util.*;

class Account {
    int accNo;
    String name;
    int balance;
    ArrayList<String> history = new ArrayList<>();

    Account(int accNo, String name, int balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    synchronized void deposit(int amount) {
        balance += amount;
        history.add("Deposited Rs." + amount);
    }

    synchronized boolean withdraw(int amount) {
        if (balance < amount)
            return false;

        balance -= amount;
        history.add("Withdrawn Rs." + amount);
        return true;
    }

    void showBalance() {
        synchronized (this) {
            System.out.println(accNo + " Balance: Rs." + balance);
        }
    }
}

class Bank {
    static int transactionId = 1;

    static void transfer(Account from, Account to, int amount) {
        Account first = from.accNo < to.accNo ? from : to;
        Account second = from.accNo < to.accNo ? to : from;

        synchronized (first) {
            synchronized (second) {

                if (from.balance < amount) {
                    from.history.add("Transfer FAILED to " + to.accNo);
                    return;
                }

                try {
                    Thread.sleep(100);
                } catch (Exception e) {}

                from.balance -= amount;
                to.balance += amount;

                int id = transactionId++;

                from.history.add("T" + id + " Transfer Rs." + amount +
                        " to " + to.accNo);

                to.history.add("T" + id + " Received Rs." + amount +
                        " from " + from.accNo);
            }
        }
    }
}

class Customer implements Runnable {
    Account a, b;
    int choice, amount;

    Customer(Account a, Account b, int choice, int amount) {
        this.a = a;
        this.b = b;
        this.choice = choice;
        this.amount = amount;
    }

    public void run() {
        try {
            Thread.sleep(100);

            if (choice == 1) {
                a.deposit(amount);
                System.out.println("Deposit completed: " + a.accNo);
            }
            else if (choice == 2) {
                if (a.withdraw(amount))
                    System.out.println("Withdrawal completed: " + a.accNo);
                else
                    System.out.println("Withdrawal failed: " + a.accNo);
            }
            else if (choice == 3) {
                Bank.transfer(a, b, amount);
                System.out.println("Transfer: " + a.accNo + " -> " + b.accNo);
            }
            else {
                a.showBalance();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) throws Exception {

        Account a1 = new Account(1001, "AAA", 20000);
        Account a2 = new Account(1002, "BBB", 15000);
        Account a3 = new Account(1003, "CCC", 10000);

        Thread[] t = new Thread[10];

        t[0] = new Thread(new Customer(a1, a2, 3, 5000));
        t[1] = new Thread(new Customer(a2, a2, 2, 7000));
        t[2] = new Thread(new Customer(a3, a3, 1, 3000));
        t[3] = new Thread(new Customer(a2, a3, 3, 8000));
        t[4] = new Thread(new Customer(a1, a1, 2, 4000));
        t[5] = new Thread(new Customer(a2, a1, 3, 2000));
        t[6] = new Thread(new Customer(a3, a1, 3, 3000));
        t[7] = new Thread(new Customer(a1, a2, 1, 5000));
        t[8] = new Thread(new Customer(a3, a3, 2, 2000));
        t[9] = new Thread(new Customer(a2, a3, 4, 0));

        for (Thread x : t)
            x.start();

        for (Thread x : t)
            x.join();


        System.out.println("\nAccount " + a1.accNo);
        System.out.println("Customer: " + a1.name);
        System.out.println("Final Balance: Rs." + a1.balance);
        System.out.println("History: " + a1.history);

        System.out.println("\nAccount " + a2.accNo);
        System.out.println("Customer: " + a2.name);
        System.out.println("Final Balance: Rs." + a2.balance);
        System.out.println("History: " + a2.history);

        System.out.println("\nAccount " + a3.accNo);
        System.out.println("Customer: " + a3.name);
        System.out.println("Final Balance: Rs." + a3.balance);
        System.out.println("History: " + a3.history);
    }
}
