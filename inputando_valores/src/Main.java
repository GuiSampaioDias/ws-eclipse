import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);// essa linha nos permite colocar o valor de double  com '.' ao invés de ','
		Scanner sc = new Scanner(System.in);
		
		int idade;
		String nome;
		double peso;
		char sexo;
		
		System.out.print("Digite o seu nome: ");
		nome = sc.nextLine();// o nextLine lê o imput até a quebra de linha(permite espaço entre as strings
							
		System.out.print("Quantos anos você tem: ");
		idade = sc.nextInt();
		
		System.out.print("Quanto você pesa: ");
		peso = sc.nextDouble();
		
		System.out.print("Sexo (M/F): ");
		sexo = sc.next().charAt(0);// No caso do next sem o Line ele lê uma palavra só
		
		System.out.printf("Olá %s%nVocê tem %d anos.%nVocê pesa %.2f kilogramas%nSexo %s%n",nome, idade, peso, sexo);
		
		
		sc.close();
	}

}
