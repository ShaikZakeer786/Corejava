package HMSproject;

import java.util.Scanner;

//step1: step Constants Class (Q4 & Q8)
final class HotelConstants {
    public static final String HOTEL_NAME = "KONIC GRAND HOTEL";
    public static final double TAX_RATE = 0.18;
}
// STEP 2: Utility Class (Q11)
class HotelUtil {
    static int counter = 1000;

    public static String generateBookingId() {
        counter++;
        return "H" + counter;
    }
}
//STEP 3: Base Class – Person (Q10)
class Person {
    public String name;
    String role;

    Person(String name, String role) {
        this.name = name;
        this.role = role;
    }

    void showDetails() {
        System.out.println("Person Name: " + name);
        System.out.println("Role: " + role);
    }
}
//STEP 4: Child Class – Guest (Q1,Q10)
class Guest extends Person {

    private String phone;

    Guest(String name, String phone) {
        super(name, "Guest");
        if (phone.length() == 10) {
            this.phone = phone;
        } else {
            System.out.println("Invalid Phone Number");
        }
    }

    String getPhone() {
        return phone;

    }
}
//STEP 5: Abstract Class – RoomService (Q2 & Q3)
abstract class RoomService {
    abstract int getPrice();
    abstract void provideService();
}
class StandardRoomService extends RoomService {

    int getPrice() {
        return 2000;
    }

    void provideService() {
        System.out.println("Providing Standard Room Service");
    }
}
class DeluxeRoomService extends RoomService {

    int getPrice() {
        return 4000;
    }

    void provideService() {
        System.out.println("Providing Deluxe Room Service");
    }
}
//STEP 6: Payment Interface(Q5)
interface Payment {
    void pay(double amount);
}
class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment Successful using UPI");
        System.out.println("Amount Paid: " + amount);
    }
}
class CashPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment Successful using Cash");
        System.out.println("Amount Paid: " + amount);
    }
}
//STEP 7: Notification Interface (Q6)
interface Notifier {
    void send();
}
class SMSNotifier implements Notifier {
    public void send() {
        System.out.println("SMS Notification Sent");
    }
}
class EmailNotifier implements Notifier {
    public void send() {
        System.out.println("Email Notification Sent");
    }
}
//STEP 8: Static Counter (Q7)
class BookingCounter {
    static int totalBookings = 0;
}

public class HotelApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q1 – Guest Registration
        System.out.print("Enter Guest Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        Guest guest = new Guest(name, phone);
        System.out.println("Guest Registered");

        // Q2 – Room Booking
        RoomService room = new StandardRoomService();
        System.out.println("Standard Room Booked");
        System.out.println("Price per day: " + room.getPrice());

        // Q3 – Polymorphism 
        room.provideService();

        // Q4 – Billing
        System.out.print("Enter Days: ");
        int days = sc.nextInt();

        int charge = room.getPrice() * days;
        double tax = charge * HotelConstants.TAX_RATE;
        double total = charge + tax;

        System.out.println("Room Charge: " + charge);
        System.out.println("Tax (18%): " + tax);
        System.out.println("Total Bill: " + total);

        // Q5 – Payment
        Payment payment = new UPIPayment();
        payment.pay(total);

        // Q6 – Notification
        Notifier notifier = new SMSNotifier();
        notifier.send();

        // Q7 – Static Counter
        BookingCounter.totalBookings++;
        System.out.println("Total Rooms Booked: " + BookingCounter.totalBookings);

        // Q8 – Hotel Name
        System.out.println(HotelConstants.HOTEL_NAME);

        // Q9 – Access Modifier Test
        System.out.println("Public Access: Allowed");
        System.out.println("Protected Access: Allowed");
        System.out.println("Default Access: Allowed");
        System.out.println("Private Access: Not Allowed");

        // Q10 – Parent Reference
        Person p = guest;
        p.showDetails();

        // Q11 – Booking ID
        System.out.println("Booking ID: " + HotelUtil.generateBookingId());

        // Q12 – Final Message
        System.out.println("Thank you for visiting " + HotelConstants.HOTEL_NAME);

        sc.close();
    }
}

