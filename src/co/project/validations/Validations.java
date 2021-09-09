package co.project.validations;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import co.project.customers.Customer;

public class Validations {

	public boolean checkName(String name) {
		boolean check = true;
		if (name.matches(".*\\d.*")) {
			check = false;
			System.out.println("Enter a correct name: ");
			Scanner in = new Scanner(System.in);
			name = in.nextLine();
			return checkName(name);
		}
		
		return check;
	}

	public boolean checkCpfIsCorrect(String cpf) {
		boolean check = true;
		
		if (cpf.matches(".*\\d.*") && cpf.length() == 11 != true) {
			check = false;
			System.out.println("Enter a correct CPF: ");
			Scanner in = new Scanner(System.in);
			cpf = in.nextLine();
			return checkCpfIsCorrect(cpf);
		}
		return check;
	}
	
	public String checkCpf(String cpf, List<Customer> customers) {
		
		checkCpfIsCorrect(cpf);
		
//		Se estiver incorreto pede pra digitar um novo cpf
		List<Customer> collect = customers
		.stream()
			.filter(
					(Customer c) -> cpf.equals(c.getCpf())).collect(Collectors.toList());
	if (!collect.isEmpty()) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("This CPF already exists, enter a new CPF.");
		System.out.println("CPF: ");
		String nextLine = scanner.nextLine();
		return checkCpf(nextLine, customers);

	}
		
		
//		Se estiver tudo ok retorna o cpf digitado
		return cpf;
	}
	
	public boolean checkEmail(String email) {
		boolean check = true;
		if ( email.indexOf('@') > 0 != true) {
			check = false;
			System.out.println("Enter a correct E-mail: ");
			Scanner in = new Scanner(System.in);
			email = in.nextLine();
			return checkEmail(email);
		}
		return check;
	}
	
	public boolean checkPhone(String phone) {
		boolean check = true;
		if (phone.matches(".*\\d.*") && phone.length() == 11 != true) {
			check = false;
			System.out.println("Enter a correct phone number: ");
			Scanner in = new Scanner(System.in);
			phone = in.nextLine();
			return checkPhone(phone);
		}
		return check;
	}
	
	
}
