package CollectionsExample;

import java.util.LinkedList;
import java.util.List;

/*
Q10. AddVIPCustomer
Question:
Create a method that adds VIP customer at beginning.
Output:
Queue After VIP: [VIP, C1, C2, C3]
 */
public class AddVIPCustomer {
List<String> customers = new LinkedList<String>();
	
	List<String> addCustomers(){
		customers.add("C1");
		customers.add("C2");
		customers.add("C3");
		customers.add(0, "VIP");
		return customers;
	}
	public static void main(String[] args) {
		AddVIPCustomer obj = new AddVIPCustomer();
		List<String> customersname = obj.addCustomers();
		System.out.println("Queue: " +customersname);
	}
	

}
