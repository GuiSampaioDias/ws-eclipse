package numeros_pares;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0 ; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		int quantidade_pares = 0;
		System.out.println("\nNÚMEROS PARES: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				quantidade_pares += 1;
			}
		}
		System.out.println("\nQUANTIDADE DE PARES = " + quantidade_pares);
		
		
		sc.close();
	}

}
