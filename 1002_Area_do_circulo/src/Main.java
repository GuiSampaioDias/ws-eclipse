import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double area, pi, raio;

		pi = 3.14159;

		raio = sc.nextDouble();
		area = pi * (raio * raio);

		System.out.printf("A=%.4f%n",area);

		sc.close();

	}

}
