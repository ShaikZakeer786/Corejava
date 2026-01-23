package AccessModifiers;

public class MovieBooking {
	/*
	 5️.Movie Ticket Booking
	Task:
	Class MovieBooking:
	public constructor → set user
	static method → showTheatre()
	switch method → chooseMovie(int option)
	non-static variable → ticketPrice
	Input: option = 2
	Output: Booked: Jawan (₹250)
*/

	int price;
	String name;
	String Tname;
	
public MovieBooking(int p,String n,String t) {
	price =p;
	name = n;
	Tname = t;
	
}
public  void showTheater() {
	System.out.println("Theater Name : " +Tname);
}
public void chooseMovie(int option) {
	switch ( option) {
	case 1:
		price = 200;
		System.out.println("Booked: salaar (₹"+price+")");
		break;
	case 2:
		price = 250;
		System.out.println("Booked: bahubali (₹"+price+")");
		break;
		
	case 3:
		price = 300;
		System.out.println("Booked: avengers (₹"+price+")");
		break;
		
		default :
			System.out.println("INVALID INPUT");
			
			
		
	}
}
public static void main(String[] args) {
	MovieBooking obj = new MovieBooking(250,"Zakeer","PVR CENIMAS");
	System.out.println("User : "+obj.name);
	System.out.println("Theater Name : " + obj.Tname);
	obj.chooseMovie(2);
	
}
}