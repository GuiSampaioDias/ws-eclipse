import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		double salario, total_de_vendas, bonus, salario_final;
		
		nome = sc.nextLine();
		salario = sc.nextDouble();
		total_de_vendas = sc.nextDouble();
		bonus = total_de_vendas * (15.0 / 100);
		salario_final = salario + bonus;
		
		System.out.printf("TOTAL = R$ %.2f%n", salario_final);
		
		System.out.println(nome);
		sc.close();
	}

}
