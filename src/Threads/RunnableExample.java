package Threads;

class Payment implements Runnable {
    public void run() {
        System.out.println("Processing payment...");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread t = new Thread(new Payment());
        t.start();
    }
}
