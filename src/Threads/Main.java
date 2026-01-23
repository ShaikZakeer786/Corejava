package Threads;

class App extends Thread {
    public void run() {
        System.out.println("App running...");
        Thread.yield(); // give chance to other thread
        System.out.println("App resumed...");
    }
}

public class Main {
    public static void main(String[] args) {
        new App().start();
    }
}

