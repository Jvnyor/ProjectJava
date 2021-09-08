package co.project.customers;

import co.project.main.Main;

public class Customer {

	private String cpf;
	private String name;
	private String phone;
	private String email;
	
	private String getCpf() {
		return cpf;
	}
	private void setCpf(String cpf) {
		this.cpf = cpf;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getPhone() {
		return phone;
	}
	private void setPhone(String phone) {
		this.phone = phone;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	public Customer(String name, String cpf, String email, String phone) {
		this.cpf = cpf;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public boolean equalsCpf(Object anObject) {
		return cpf.equals(anObject);
	}
	
	@Override
	public String toString() {
		return "\nCustomer:\n" + "Name: " + getName() + "\nCPF: " + getCpf() + "\nE-mail: " + getEmail() + "\nPhone: " + getPhone() + "\n";
	}
	
}
