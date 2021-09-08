package co.project.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.project.customers.Customer;
import co.project.validations.Validations;

public class Main {

	public static void main(String[] args) {
		
		List<Customer> customersList = new ArrayList<>();
		
		Validations validations = new Validations();
		
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
						while (validations.checkName(name) != true) {
							System.out.println("Insert a correct name: ");
							name = in.nextLine();
						}
						System.out.println("CPF: ");
						String cpf = in.nextLine();
						while (validations.checkCpf(cpf) != true) {
							System.out.println("Insert a correct CPF: ");
							cpf = in.nextLine();
						}
						// PROBLEMA
						for (int iterator = 0; iterator < customersList.size(); iterator++) {
							while (customersList.get(iterator).equalsCpf(cpf)) {
								System.out.println("This CPF already exists, insert a new CPF.");
								System.out.println("CPF: ");
								cpf = in.nextLine();
								while (validations.checkCpf(cpf) != true) {
									System.out.println("Insert a correct CPF: ");
									cpf = in.nextLine();
								}
							}
						}
						// PROBLEMA ^^
						System.out.println("E-mail: ");
						String email = in.nextLine();
						while (validations.checkEmail(email) != true) {
							System.out.println("Insert a correct E-mail: ");
							email = in.nextLine();
						}
						System.out.println("Phone: ");
						String phone = in.nextLine();
						while (validations.checkPhone(phone) != true) {
							System.out.println("Insert a correct phone number: ");
							phone = in.nextLine();
						}
						
						Customer customer = new Customer(name,cpf,email,phone);
						
						customersList.add(customer);
						System.out.println(customersList);
						
						System.out.println("List size: " + customersList.size());

				
				break;
//			case 2:
//				System.out.println("Enter a CPF to search a customer: ");
//				Scanner value = new Scanner(System.in);
//				String cpfValue = value.nextLine();
//				for (int iterator = 0; iterator < customersList.size(); iterator++) {
//					if (customersList.get(iterator).equalsCpf(cpfValue)) {
//						System.out.println("This name already exists");
//					}
//				}
//				
			case 2:
				System.out.println("Program finished");
				break;
			}
			
		}
		
		
	}

}
