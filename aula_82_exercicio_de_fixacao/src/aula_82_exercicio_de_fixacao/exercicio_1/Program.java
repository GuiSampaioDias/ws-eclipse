package aula_82_exercicio_de_fixacao.exercicio_1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter Account hoder: ");
		String name = sc.nextLine();
		
		
		
		System.out.print("Is there na initial deposit (y/n)? ");
		String res = sc.next();
		
		Account account;
		
		if(res.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			double inicial_deposit = sc.nextDouble();
			account = new Account(number, name, inicial_deposit);
		}else {
			account = new Account(number, name);
		}
		
		System.out.println("\nAccount data: \n" + account);
		
		System.out.print("\nEnter deposit value: ");
		double deposit = sc.nextDouble();
		
		account.deposit(deposit);
		System.out.println("Updated account data: \n" + account);
		
		System.out.print("\nEnter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println("Updated account data: \n" + account);
		
		sc.close();
	}

}
