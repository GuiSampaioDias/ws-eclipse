import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		String[] valores = entrada.split(" ");
		
		double r1, r2, delta;
		double a = Double.parseDouble(valores[0]);
		double b = Double.parseDouble(valores[1]);
		double c = Double.parseDouble(valores[2]);
		
		delta = Math.pow(b, 2.0) - (4 * a * c);
		
		if(delta < 0 || 2 * a == 0) {
			System.out.println("Impossivel calcular");
		}
		else {
			r1 = (-b + Math.sqrt(delta)) / (2 * a);
			r2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.printf("R1 = %.5f%n",r1);
			System.out.printf("R2 = %.5f%n",r2);
		}
		
		sc.close();
	}

}
