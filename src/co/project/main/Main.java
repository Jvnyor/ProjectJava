package co.project.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.project.alterations.Alterations;
import co.project.customers.Customer;
import co.project.validations.Validations;

public class Main {

	public static void main(String[] args) {
		
		List<Customer> customersList = new ArrayList<>();
		
		Validations validations = new Validations();
		
		Alterations alterations = new Alterations();
		
		int i = 0;
		while (i != 2) {
			Scanner select = new Scanner(System.in);
			
			System.out.println("Type 1 to register customer." +
								"\nType 2 to finalize program.");
			i = select.nextInt();
			switch (i) {
			case 1:
						Scanner in = new Scanner(System.in);
						
						System.out.println("Name: ");
						String name = in.nextLine();
						validations.checkName(name);
						
						System.out.println("CPF: ");
						String cpf = in.nextLine();
						cpf = validations.checkCpf(cpf, customersList);

						System.out.println("E-mail: ");
						String email = in.nextLine();
						validations.checkEmail(email);
						
						System.out.println("Phone: ");
						String phone = in.nextLine();
						validations.checkPhone(phone);
						
						Customer customer = new Customer(name,cpf,email,phone);
						
						customersList.add(customer);
						System.out.println(customersList);
						
						System.out.println("List size: " + customersList.size());

				
				break;
				// PENDENTE \/ \/
//			case 2:
//				System.out.println("Enter a CPF to alter a customer: ");
//				Scanner value = new Scanner(System.in);
//				String cpfValue = value.nextLine();
//				for (int iterator = 0; iterator < customersList.size(); iterator++) {
//					if (customersList.get(iterator).equals(cpfValue)) {
////						alterations.alterNameAndEmail(iterator, name, email, customersList);
//					}
//				}
				// PENDENTE /\ /\
			case 2:
				System.out.println("Program finished");
				break;
				
			default:
				System.out.println("Invalid number!");
				break;
			}
			
		}
		
		
	}

}
