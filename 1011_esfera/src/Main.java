import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double R,cubo, volume, pi = 3.14159;
		
		R = sc.nextInt();
		cubo = Math.pow(R, 3.0);
		
		volume = (4.0/ 3) * pi * cubo;
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();
	}

}
