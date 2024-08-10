package desconto_expressao_condicional_ternaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double  valor_compra = sc.nextDouble();
		sc.close();
		
		double desconto = (valor_compra >= 500) ? valor_compra * 0.075: valor_compra * 0.05;
		
		System.out.println("Você terá um desconto de: R$ " + desconto);

	}

}
