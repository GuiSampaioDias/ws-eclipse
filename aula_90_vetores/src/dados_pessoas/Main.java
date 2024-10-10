package dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i = 0; i < altura.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1 );
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			genero[i] = sc.next().charAt(0);
		}
		int maior_altura = 0;
		int menor_altura = 0;
		double total_altura_mulheres = 0;
		int total_numero_homens = 0; 
		
		if(genero[0]== 'F'){
			total_altura_mulheres += altura[0];
		}else {
			total_numero_homens += 1;
		}
		
		
		for(int i = 1; i < altura.length; i ++) {
			if(altura[maior_altura] < altura[i] ) {
				maior_altura = i;
			}
			if(altura[menor_altura] > altura[i] ) {
				menor_altura = i;
			}
			if(genero[i]== 'F'){
				total_altura_mulheres += altura[i];
			}else {
				total_numero_homens += 1;
			}
		}
		System.out.println("Menor altura = " + String.format("%.2f", altura[menor_altura]));
		System.out.println("Maior altura = " + String.format("%.2f", altura[maior_altura]));
		double media_altura_mulheres = total_altura_mulheres / (altura.length - total_numero_homens);
		System.out.println("Media das alturas das mulheres =  " + String.format("%.2f", media_altura_mulheres));
		System.out.println("Número de homens = " + total_numero_homens);
		
		
		sc.close();
	}

}
