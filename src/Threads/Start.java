package Threads;

class WhatsApp extends Thread {
    public void run() {
        System.out.println("WhatsApp is running...");
    }
}

public class Start {
    public static void main(String[] args) {
        WhatsApp app = new WhatsApp();
        app.start(); // start WhatsApp
    }
}

