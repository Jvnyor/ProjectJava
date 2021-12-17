package co.project.customers;

public class Customer {

	private String cpf;
	private String name;
	private String phone;
	private String email;
	private String reserva;
	
	public String getReserva() {
		return reserva;
	}

	public void setReserva(String reserva) {
		this.reserva = reserva;
	}

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
	public Customer(String name, String cpf, String email, String phone, String reserva) {
		this.cpf = cpf;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.reserva = reserva;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\nCustomer:\n" + "Name: " + getName() + "\nCPF: " + getCpf() + "\nE-mail: " + getEmail() + "\nPhone: " + getPhone() + "\nReserva: " +getReserva();
	}
	
}
