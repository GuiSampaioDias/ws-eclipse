package alturas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Quantas pessoas serão digitadas? ");
	int n = sc.nextInt();
	Pessoa[] pessoas = new Pessoa[n];
	int menos_16 = 0;
	for(int i = 0; i < pessoas.length ; i++) {
		System.out.println("Dados da " + (i + 1) + "a pessoa:" );
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		pessoas[i] = new Pessoa(nome, idade, altura);
		if(idade < 16 ) {
			menos_16 +=1;
		}
		
	}	
	int posicao = 0;
	String[] nomes = new String[menos_16];
	double soma_alturas = 0;
	for(int i = 0 ; i < pessoas.length; i++ ) {
		soma_alturas += pessoas[i].getAltura();
		if(pessoas[i].getIdade()< 16) {
			nomes[posicao] = pessoas[i].getNome();
			posicao +=1;
		}
	}
	System.out.println("\nAltura média: " + String.format("%.2f", soma_alturas / pessoas.length) );
	System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", (double)menos_16 / (double)pessoas.length *100) + "%");
	for(int i = 0; i < nomes.length; i++) {
		System.out.println(nomes[i]);
	}
	
	sc.close();	
	}
}
