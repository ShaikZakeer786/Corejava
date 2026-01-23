package Threads;

class Download extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Download cancelled!");
        }
    }
}


public class interrupt {
    public static void main(String[] args) {
        Download d = new Download();
        d.start();
        d.interrupt(); // cancel download
    }
}

