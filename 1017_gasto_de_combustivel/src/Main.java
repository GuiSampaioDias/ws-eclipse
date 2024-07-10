import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distancia;
		double litros, autonomia = 12.0;
		
		int horas = sc.nextInt();
		int velocidade = sc.nextInt();
		
		distancia = horas * velocidade;
	    litros = distancia / autonomia;
		
	    System.out.printf("%.3f%n", litros);
		sc.close();
	}

}
