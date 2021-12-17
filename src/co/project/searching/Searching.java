package co.project.searching;

import co.project.informations.Informations;
import co.project.customers.Customer;

public class Searching {

	Informations informations = new Informations();
	
	public Customer findByCpf(String cpf) throws Exception {
		return informations.customersList.stream()
                .filter(customer -> customer.getCpf().equals(cpf))
                .findFirst()
                .orElseThrow(() -> new Exception("CPF not found"));
	}

}
