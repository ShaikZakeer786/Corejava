package Threads;

class AliveThread extends Thread {
    public void run() {
        System.out.println("Thread executing...");
    }
}

public class AliveExample {
    public static void main(String[] args) {
        AliveThread t = new AliveThread();
        t.start();
        System.out.println("Is thread alive? " + t.isAlive());
    }
}

