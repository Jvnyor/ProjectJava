package co.project.remove;

import co.project.customers.Customer;
import co.project.informations.Informations;
import co.project.searching.Searching;

public class Remove {

	Customer customer = new Customer();
	
	Informations informations = new Informations();
	
	Searching searching = new Searching();
	
	public String removeCustomer(String cpf) throws Exception {
		if(customer.getReserva()=="SIM") {
			return "Não é possível excluir o cliente, pois ele possui reserva";
		} else {
			informations.customersList.remove(searching.findByCpf(cpf));
			return "Customer deleted";
		}
		
	}

}
