package media_pares;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		double soma_par = 0;
		int total_pares = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				soma_par += (double)vetor[i];
				total_pares += 1;
			}
		}
		if(total_pares == 0) {
			System.out.println("NENHUM NÚMERO PAR");
		}else {
			double media = soma_par / total_pares;
			System.out.println("MÉIDA DOS PARES = " + String.format("%.1f", media));
		}
		sc.close();
	}

}
