package com.tns.singleinheritance;
public class CustomerDemo {

	public CustomerDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void init(){
		Customer customer=new Customer("Oliver","Gierke",
				new Address("625 Avenue of the Americas","10011","New york",new Location(40.740337,-73.995146)));
		customers.save(customer);
	}
	// TODO Auto-generated method stub

	@Override
	public String toString() {
		return "CustomerDemo []";
	}

	}

