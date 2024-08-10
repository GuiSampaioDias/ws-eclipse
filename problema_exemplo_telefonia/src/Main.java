import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int minutos = sc.nextInt();
		sc.close();
		
		double total_a_pagar = 50.0;
		
		if(minutos > 100) {
			minutos -= 100;
			total_a_pagar += (minutos * 2.0);
			
		}
		System.out.printf("Valor a pagar: R$ %.2f", total_a_pagar);
		
	}

}
