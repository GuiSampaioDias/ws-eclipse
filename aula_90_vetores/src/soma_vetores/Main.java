package soma_vetores;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorA[i] + vetorB[i]);
		}
		
		
		sc.close();
	}

}
