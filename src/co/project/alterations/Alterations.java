package co.project.alterations;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import co.project.customers.Customer;
import co.project.validations.Validations;

public class Alterations {
	
	Validations validations = new Validations();

	public String alterNameAndEmail(String cpf, String name, String email, List<Customer> customers){

		Customer customer = new Customer(name, cpf, email, null);
		
		validations.checkCpfIsCorrect(cpf);
		
		List<Customer> collect = customers
		.stream()
			.filter(
					(Customer c) -> cpf.equals(c.getCpf())).collect(Collectors.toList());
		if (!collect.isEmpty()) {
			
			return "Name: " + name + "\nE-mail: " + email;
	
		}
		
		return alterNameAndEmail(cpf, customer.getName(), customer.getEmail(), customers);
		
	}

}
