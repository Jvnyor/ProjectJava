package co.project.customers;

public class Customer {

	private String cpf;
	private String name;
	private String phone;
	private String email;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer(String name, String cpf, String email, String phone) {
		this.cpf = cpf;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "\nCustomer:\n" + "Name: " + getName() + "\nCPF: " + getCpf() + "\nE-mail: " + getEmail() + "\nPhone: " + getPhone() + "\n";
	}
	
}
