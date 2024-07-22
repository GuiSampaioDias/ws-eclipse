import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String valores = sc.nextLine();
		sc.close();
		String[] valor = valores.split(" ");
		double total;
		double prato = Double.parseDouble(valor[0]);
		double quantidade = Double.parseDouble(valor[1]);
		
		if(prato == 1) {
			total = 4.0 * quantidade;
		}
		else if(prato == 2) {
			total = 4.5 * quantidade;
		}
		else if(prato == 3) {
			total = 5.0 * quantidade; 
		}
		else if(prato == 4) {
			total = 2.0 * quantidade;
		}
		else {
			total = 1.5 * quantidade;
		}
		System.out.printf("Total: R$ %.2f%n", total);
		

	}

}
