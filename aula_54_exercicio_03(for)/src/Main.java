import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma, media;
		
		int quantidade = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < quantidade; i++) {
			String valor = sc.nextLine();
			String[] valores = valor.split(" ");
			double valor1 = Double.parseDouble(valores[0]);
			double valor2 = Double.parseDouble(valores[1]);
			double valor3 = Double.parseDouble(valores[2]);
			soma = valor1 * 2 + valor2 * 3 + valor3 * 5;
			media = soma / 10.0;
			System.out.printf("%.1f%n", media);
		}
		
		
		sc.close();
	}

}
