import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distancia;
		double litros, autonomia;
		
		distancia = sc.nextInt();
		litros = sc.nextDouble();
		autonomia = distancia / litros;
		
		System.out.printf("%.3f km/l%n", autonomia);
		
		sc.close();
	}

}
