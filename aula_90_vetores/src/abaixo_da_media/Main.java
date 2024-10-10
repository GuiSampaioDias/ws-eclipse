package abaixo_da_media;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n]; 
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		double soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		double media = soma / vetor.length;
		System.out.println("MEDIA DO VETOR = " + String.format("%.3f", media));
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < media) {
				System.out.println();
			}
		}
				
		sc.close();
	}

}
