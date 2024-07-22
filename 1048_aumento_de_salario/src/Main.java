import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		sc.close();
		
		int por_cento = 0;
		
		if(salario > 0 && salario <= 400) {
			por_cento = 15;
		}
		else if(400 < salario && salario <= 800) {
			por_cento = 12;
		}
		else if(800 < salario && salario <= 1200) {
			por_cento = 10;
		}
		else if(1200 < salario && salario <= 2000) {
			por_cento = 7;
		}
		else if( salario > 2000) {
			por_cento = 4;
		}
		double aumento = salario * por_cento / 100;
		salario += aumento;
		
		System.out.printf("Novo salario: %.2f%n", salario);
		System.out.printf("Reajuste ganho: %.2f%n", aumento);
		System.out.printf("Em percentual: %d %%%n", por_cento);
	}

}
