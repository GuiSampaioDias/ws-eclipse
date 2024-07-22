import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String valor = sc.nextLine();
		String[] valores = valor.split(" ");
		sc.close();
		
		double a = Double.parseDouble(valores[0]);
		double b = Double.parseDouble(valores[1]);
		double c = Double.parseDouble(valores[2]);
		double trapezio;
		
		if(a + b > c && a + c > b  && b + c > a) {
			System.out.printf("Perimetro = %.1f%n", a + b + c);
		}
		else {
			trapezio = (a + b) * c / 2;
			System.out.printf("Area = %.1f%n", trapezio);
		}
	}

}
