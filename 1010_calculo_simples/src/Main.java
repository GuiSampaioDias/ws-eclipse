import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double total;
		
		String linha1 = sc.nextLine();
		String linha2 = sc.nextLine();
		
		String[] separando_linha1 = linha1.split(" ");
		String[] separando_linha2 = linha2.split(" ");
		
		double valor1 = Double.parseDouble(separando_linha1[1]);
		double valor2 = Double.parseDouble(separando_linha1[2]);
		double valor3 = Double.parseDouble(separando_linha2[1]);
		double valor4 = Double.parseDouble(separando_linha2[2]);
		
		total = (valor1 * valor2 + valor3 * valor4);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		
		sc.close();
	}

}
