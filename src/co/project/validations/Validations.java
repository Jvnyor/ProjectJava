package co.project.validations;

//import co.project.customers.Customer;

public class Validations {

	public boolean checkName(String name) {
		boolean check = true;
		if (name.matches(".*\\d.*")) {
			check = false;
		}
		return check;
	}

	public boolean checkCpf(String cpf) {
		boolean check = false;
		if (cpf.matches(".*\\d.*") && cpf.length() == 11) {
			check = true;
		}
		return check;
	}
	
	public boolean checkEmail(String email) {
		boolean check = false;
		if (email.contains("@")) {
			check = true;
		}
		return check;
	}
	
	public boolean checkPhone(String phone) {
		boolean check = false;
		if (phone.matches(".*\\d.*") && phone.length() == 10) {
			check = true;
		}
		return check;
	}
	
	
}
