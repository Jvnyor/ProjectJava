package co.project.main;

import co.project.custumers.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList();
		LinkedList<Integer> cpf = new LinkedList();
		LinkedList<String> email = new LinkedList();
		LinkedList<Integer> phone = new LinkedList();
		
		int it = 0;
		while (it != 2) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("Digite 1 entrar no menu de clientes." +
								"\nDigite 2 para finalizar o programa.");
			it = s.nextInt();
			switch (it) {
			case 1:
				
				int it2 = 0;
				while (it2 != 2) {
					Scanner s1 = new Scanner(System.in);
					
					System.out.println("Digite 1 para cadastrar um cliente." +
										"\nDigite 2 para sair do cadastro de clientes.");
					it2 = s1.nextInt();
					switch (it2) {
					case 1:
						Scanner in = new Scanner(System.in);
						
						name.add(in.next());
						cpf.add(in.nextInt());
						email.add(in.next());
						phone.add(in.nextInt());
						
						List<Customer> customersList = new LinkedList<>();
						
						Customer customer = new Customer();
						
						int i = 0;
						do {
							customer.registerCustomers(name.get(i), cpf.get(i), email.get(i), phone.get(i));
							customersList.add(customer);
							
							i++;
						} while (i < customersList.size());
						
						int iterator = 0;
						do {
							System.out.println(customersList.get(iterator));
							iterator++;
						} while (iterator < customersList.size());
						
						break;
					case 2:
						System.out.println("Saiu do cadastro de clientes.");
						break;
					}
				}
				
				break;
			case 2:
				System.out.println("finalizou");
				break;
			}
			
		}
		
		
	}

}
