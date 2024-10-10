package aula_82_exercicio_de_fixacao.exercicio_1;

public class Account {
	private int number;
	private String name;
	private double balance;
	
	public Account() {
		
	}
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Account(int number, String name, double inicialDeposit) {
		this.number = number;
		this.name = name;
		deposit(inicialDeposit);
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double withdraw) {
		balance -= (withdraw + 5);
	}
	
	public int get_number() {
		return number;
	}
	public String get_name() {
		return name;
	}
	public void set_name(String name) {
		this.name = name;
	}
	public String get_balance() {
		return String.format("%.2f", balance);
	}

	
	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance: " + get_balance();
	}
	
}
