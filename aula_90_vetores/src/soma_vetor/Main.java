package soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números vai digitar? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		double soma = 0 ;
		System.out.print("\nVALORES = ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(String.format("%.1f", vetor[i]) + " ");
			soma += vetor[i];
		}
		double media = soma / vetor.length;
		
		System.out.println("\nSOMA = " + String.format("%.2f", soma));
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		sc.close();
	}

}
