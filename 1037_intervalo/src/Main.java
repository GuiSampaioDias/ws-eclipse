import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double valor = sc.nextDouble();
		sc.close();
		
		if( 0 <= valor && valor <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if(25 < valor && valor <= 50) {
			System.out.println("Intervalo (25,50]");
		}
		else if(50 < valor && valor <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		else if(75 < valor && valor <= 100) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
	}

}
