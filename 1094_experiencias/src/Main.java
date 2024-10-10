import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantidade = sc.nextInt();
		int total = 0, coelhos = 0, ratos = 0, sapos = 0;
		double per_rato = 0, per_coelho = 0, per_sapos = 0;
		for (int i = 0; i < quantidade; i++) {
			int valor = sc.nextInt();
		
			char animal = sc.next().charAt(0);
			total += valor;
			switch (animal) {
				case 'C':
					coelhos += valor;
					break;
				case 'R':
					ratos += valor;
					break;
				case 'S':
					sapos += valor;
					break;
				default:
					break;

			}
			
			


		}
		per_rato = 100 * (double)ratos / (double)total;
		per_coelho = 100 * (double)coelhos / (double)total;
		per_sapos = 100 * (double)sapos / (double)total;
		
		System.out.printf("Total: %d cobaias%n", total);
		System.out.printf("Total de coelhos: %d%n", coelhos);
		System.out.printf("Total de ratos: %d%n", ratos);
		System.out.printf("Total de sapos: %d%n", sapos);
		System.out.printf("Percentual de coelhos: %.2f %%%n", per_coelho);
		System.out.printf("Percentual de ratos: %.2f %%%n", per_rato);
		System.out.printf("Percentual de sapos: %.2f %%%n", per_sapos);

		sc.close();
	}

}
