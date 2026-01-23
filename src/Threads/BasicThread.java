package Threads;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class BasicThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}

