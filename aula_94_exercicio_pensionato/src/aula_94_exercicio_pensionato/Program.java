package aula_94_exercicio_pensionato;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Pensionato[] pensionato = new Pensionato[10];
		
		for(int i = 0; i < n; i ++) {
			System.out.printf("Rent #%d:%n" , i + 1);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			pensionato[room] = new Pensionato(name, email);
				
		}
		for(int i = 0; i < 10; i++) {
			if(pensionato[i] != null) {
				System.out.printf("%d: %s,%s%n", i, pensionato[i].getName(),pensionato[i].getEmail());
			}
		}
		
		
		sc.close();
	}

}
