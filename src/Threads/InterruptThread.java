package Threads;

class MyThreads extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
    }
}

public class InterruptThread {
    public static void main(String[] args) {
        MyThreads t = new MyThreads();
        t.start();
        t.interrupt();
    }
}

