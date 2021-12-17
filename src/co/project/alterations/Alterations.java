package co.project.alterations;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import co.project.customers.Customer;
import co.project.informations.Informations;
import co.project.remove.Remove;
import co.project.searching.Searching;
import co.project.validations.Validations;

public class Alterations {
	
	Remove remove = new Remove();
	
	Validations validations = new Validations();
	
	Informations informations = new Informations();
	
	Searching searching = new Searching();

	public List<Customer> alterEmail(String cpf,String email,List<Customer> listCustomers) throws Exception{
		Customer customerToAlter = searching.findByCpf(cpf);
		customerToAlter.setEmail(email);
		return listCustomers;
	}
	
	public List<Customer> alterPhone(String cpf,String phone,List<Customer> listCustomers) throws Exception{
		Customer customerToAlter = searching.findByCpf(cpf);
		customerToAlter.setPhone(phone);
		return listCustomers;
	}

}
