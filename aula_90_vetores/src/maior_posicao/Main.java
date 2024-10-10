package maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Dibite um número: ");
			vetor[i] = sc.nextDouble();
		}
		double maior = vetor[0];
		int posicao = 0;
		for(int i = 1; i < vetor.length; i++) {
			if(maior < vetor[i]) {
				maior = vetor[i];
				posicao = i;
			}
		}
		System.out.println("\nMAIOR VALOR = " + maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		
		
		sc.close();
	}

}
