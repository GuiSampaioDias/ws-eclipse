package mais_velho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		for(int i = 0; i < nomes.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\n", i+1);
			
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
		}
		
		 int mais_velho = 0;
		 for(int i = 1; i < idades.length; i++) {
			 if(idades[mais_velho] < idades[i]) {
				 mais_velho = i;
			 }
		 }
		 
		 System.out.println("PESSOA MAIS VELHA: " + nomes[mais_velho]);
		sc.close();
	}

}
