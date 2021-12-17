package co.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.project.informations.Informations;
import co.project.remove.Remove;
import co.project.searching.Searching;
import co.project.alterations.Alterations;
import co.project.customers.Customer;
import co.project.validations.Validations;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Informations informations = new Informations();
		
		Validations validations = new Validations();
		
		Alterations alterations = new Alterations();
		
		Searching searching = new Searching();
		
		Remove remove = new Remove();
		
		int i = 0;
		while (i != 6) {
			Scanner select = new Scanner(System.in);
			
			System.out.println("Type 1 to register customer." +
								"\nType 2 to alter email or phone."
								+ "\nType 3 to find all customers."
								+ "\nType 4 to find customer by CPF"
								+"\nType 5 to remove customer"
								+"\nType 6 to finish program.");
			i = select.nextInt();
			switch (i) {
			case 1:
						Scanner in = new Scanner(System.in);
						
						System.out.println("Name: ");
						String name = in.nextLine();
						validations.checkName(name);
						
						System.out.println("CPF: ");
						String cpf = in.nextLine();
						cpf = validations.checkCpf(cpf, informations.customersList);

						System.out.println("E-mail: ");
						String email = in.nextLine();
						validations.checkEmail(email);
						
						System.out.println("Phone: ");
						String phone = in.nextLine();
						validations.checkPhone(phone);
						
						System.out.println("Reserva: ");
						String reserva = in.nextLine();
						validations.checkReserva(reserva);
						
						Customer customer = new Customer(name,cpf,email,phone,reserva);
						
						informations.customersList.add(customer);
						System.out.println(informations.customersList);
						
						System.out.println("List size: " + informations.customersList.size());

				
				break;
				// PENDENTE \/ \/
			case 2:
				System.out.println("Type 1 to alter E-mail, 2 to alter Phone or 3 to back to principal menu");
				int menu = 0;
				while (menu != 3) {
					switch(menu) {
					case 1:
						System.out.println("Enter a CPF to alter e-mail of customer: ");
						Scanner value = new Scanner(System.in);
						System.out.println("CPF: ");
						cpf = value.nextLine();
						System.out.println("E-mail: ");
						email = value.nextLine();
						validations.checkEmail(email);
						alterations.alterEmail(cpf, email, informations.customersList);
						System.out.println(informations.customersList);
						break;
					case 2:
						System.out.println("Enter a CPF to alter phone of customer: ");
						Scanner value2 = new Scanner(System.in);
						System.out.println("CPF: ");
						cpf = value2.nextLine();
						System.out.println("Phone: ");
						phone = value2.nextLine();
						validations.checkPhone(phone);
						alterations.alterPhone(cpf, phone, informations.customersList);
						System.out.println(informations.customersList);
						break;
					case 3:
						System.out.println("Alterations menu finished.");
						break;
					default:
						System.out.println("invalid number");
						break;
					}
				}
				
				break;
				// PENDENTE /\ /\
			case 3:
				System.out.println(informations.customersList);
				break;
			case 4:
				System.out.println("Enter a CPF to find customer: ");
				Scanner cpfIn = new Scanner(System.in);
				cpf = cpfIn.nextLine();
				System.out.println(searching.findByCpf(cpf));
				break;
			case 5:
				System.out.println("Enter a CPF to remove customer: ");
				Scanner cpfToRemove = new Scanner(System.in);
				cpf = cpfToRemove.nextLine();
				System.out.println(remove.removeCustomer(cpf));
				break;
			case 6:
				System.out.println("Program finished.");
				break;
			default:
				System.out.println("Invalid number!");
				break;
			}
			
		}
		
		
	}

}
