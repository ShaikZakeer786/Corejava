package Threads;

public class ThreadName {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setName("MyThread");
        System.out.println("Thread Name: " + t.getName());
    }
}

