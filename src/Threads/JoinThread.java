package Threads;

class Downloadfile extends Thread {
    public void run() {
        System.out.println("Downloading file...");
    }
}

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        Downloadfile d = new Downloadfile();
        d.start();
        d.join(); // wait for download
        System.out.println("File opened");
    }
}


