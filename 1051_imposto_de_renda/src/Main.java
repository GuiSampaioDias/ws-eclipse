import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda = sc.nextDouble();
		double valor_do_imposto = 0, imposto_anterior;
		
		sc.close();
		if(renda >= 0 && renda <= 2000) {
			System.out.println("Isento");
		}
		else if(renda > 2000 && renda <= 3000) {
			valor_do_imposto = (renda - 2000.0) * 8.0 / 100;
		}
		else if(renda> 3000 && renda <= 4500) {
			imposto_anterior = 1000 * 8.0 / 100;
			valor_do_imposto = (renda - 3000) * 18.0 / 100;
			valor_do_imposto += imposto_anterior;
		}
		else if(renda > 4500) {
			imposto_anterior = (1000 * 8.0 / 100) + (1500 * 18 /100);
			valor_do_imposto = (renda- 4500) * 28 / 100;
			valor_do_imposto += imposto_anterior;
		}
		if(renda> 2000) { 	
		System.out.printf("R$ %.2f%n", valor_do_imposto);
		}
		
	}

}
