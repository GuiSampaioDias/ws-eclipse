package aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		for(int i = 0; i < nome.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do "+ (i + 1) + "o aluno: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		System.out.println("Alunos Aprovados: ");
		for(int i = 0; i < nome.length; i++) {
			if((nota1[i] + nota2[i]) / 2 >= 6.0 ) {
				System.out.println(nome[i]);
			}
		}
		System.out.println();
		
		sc.close();
	}

}
