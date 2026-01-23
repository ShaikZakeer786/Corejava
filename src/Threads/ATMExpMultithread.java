package Threads;

class ATM extends Thread {
    public void run() {
        System.out.println(getName() + " is using ATM");
    }
}

public class ATMExpMultithread {
    public static void main(String[] args) {

        ATM user1 = new ATM(); 
        ATM user2 = new ATM(); 

        user1.setName("User-1");
        user2.setName("User-2");

        user1.start(); 
        user2.start(); 
    }
}
