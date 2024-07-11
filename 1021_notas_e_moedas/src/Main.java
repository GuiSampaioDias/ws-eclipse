import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double total = sc.nextDouble();
		
		System.out.println("NOTAS:");
		
		System.out.printf("%d nota(s) de R$ 100.00%n", (int)total / 100);
		total -= ((int)total / 100 * 100);
		
		System.out.printf("%d nota(s) de R$ 50.00%n", (int)total / 50);
		total -=  ((int)total / 50 * 50);
		
		System.out.printf("%d nota(s) de R$ 20.00%n", (int)total / 20);
		total -= ((int)total / 20 * 20);
		
		System.out.printf("%d nota(s) de R$ 10.00%n", (int)total / 10);
		total -= ((int)total / 10 * 10);
		
		System.out.printf("%d nota(s) de R$ 5.00%n",(int)total / 5);
		total -= ((int)total / 5 * 5);
		
		System.out.printf("%d nota(s) de R$ 2.00%n", (int)total / 2);
		total -= ((int)total / 2 * 2);
		
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ 1.00%n", (int)total);
		total = (total - (int)total) * 100;
		
		System.out.printf("%d moeda(s) de R$ 0.50%n", (int)total / 50);
		total -= (int)total / 50 * 50;
		
		System.out.printf("%d moeda(s) de R$ 0.25%n", (int)total / 25);
		total -= (int)total / 25 * 25;
		
		System.out.printf("%d moeda(s) de R$ 0.10%n", (int)total / 10);
		total -= (int)total / 10 * 10;
		
		System.out.printf("%d moeda(s) de R$ 0.05%n",(int)total / 5);
		total -= (int)total / 5 * 5;
		
		System.out.printf("%d moeda(s) de R$ 0.01%n",(int)total);
		
		sc.close();
	}

}
