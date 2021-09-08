package co.project.custumers;

import co.project.main.Main;

public class Customer {

	private int cpf;
	private String name;
	private int phone;
	private String email;
	
	private int getCpf() {
		return cpf;
	}
	private void setCpf(int cpf) {
		this.cpf = cpf;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getPhone() {
		return phone;
	}
	private void setPhone(int phone) {
		this.phone = phone;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	
	public void registerCustomers(String name, int cpf, String email, int phone) {
		setName(name);
		setCpf(cpf);
		setEmail(email);
		setPhone(phone);
	}
	@Override
	public String toString() {
		return "\nCustomer:\n" + "Name: " + getName() + "\nCPF: " + getCpf() + "\nE-mail: " + getEmail() + "\nPhone: " + getPhone() + "\n";
	}
	
}
