package Threads;

public class CurrentThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t.getName());
    }
}

