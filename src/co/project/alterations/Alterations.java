package co.project.alterations;

import java.util.List;

import co.project.customers.Customer;

public class Alterations {

	public void alterNameAndEmail(int index, Customer name, Customer email, List<Customer> customers){

		List<Customer> customer = customers;
		
	    if(index >= 0 && index < customer.size()){

	    	customer.set(index, name);
	    	customer.set(index, email);
	        
	    } 
	}

}
