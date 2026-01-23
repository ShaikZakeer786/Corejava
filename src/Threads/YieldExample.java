package Threads;

class YieldThread extends Thread {
    public void run() {
        System.out.println("Thread running...");
        Thread.yield();
        System.out.println("Thread resumed...");
    }
}

public class YieldExample {
    public static void main(String[] args) {
        YieldThread t = new YieldThread();
        t.start();
    }
}

