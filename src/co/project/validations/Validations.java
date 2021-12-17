package co.project.validations;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import co.project.customers.Customer;

public class Validations {

	public boolean checkName(String name) {
		boolean check = true;
		for (int i = 0; i < name.length(); i++) {
            if (!Character.isAlphabetic(name.charAt(i)) && !Character.isSpaceChar(name.charAt(i))) {
            	check = false;
            	System.out.println("Enter a correct name: ");
    			Scanner in = new Scanner(System.in);
    			name = in.nextLine();
    			return checkName(name);
            }
        }
		
		return check;
	}

	public boolean checkCpfIsCorrect(String cpf) {
		boolean check = true;
		for (int i = 0; i < cpf.length(); i++) {
            if (!Character.isDigit(cpf.charAt(i)) && cpf.length() != 11) {
                check = false;
                System.out.println("Enter a correct CPF: ");
    			Scanner in = new Scanner(System.in);
    			cpf = in.nextLine();
    			return checkCpfIsCorrect(cpf);
            }
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
        if (!(email.indexOf('@') > 0)) {
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
		for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i)) && phone.length() != 11) {
                check = false;
                System.out.println("Enter a correct phone number: ");
    			Scanner in = new Scanner(System.in);
    			phone = in.nextLine();
    			return checkPhone(phone);
            }
        }
		
		return check;
	}
	
	public boolean checkReserva(String reserva) {
		boolean check = false;
		if(reserva=="SIM" || reserva=="NAO") {
			check=true;
		} else {
			System.out.println("Digite SIM ou NAO para definir se possui ou não reserva");
			System.out.println("Insira SIM ou NAO: ");
 			Scanner in = new Scanner(System.in);
 			reserva = in.nextLine();
 			return checkReserva(reserva);
		}
		return check;
	}
	
}
