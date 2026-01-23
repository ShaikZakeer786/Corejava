package Threads;

class OTP extends Thread {
    public void run() {
        try {
            System.out.println("Sending OTP...");
            Thread.sleep(2000); // wait 2 seconds
            System.out.println("OTP Sent!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Sleep {
    public static void main(String[] args) {
        new OTP().start();
    }
}
