import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int repeticao;
		double val1, val2, val3, media;
		Scanner sc = new Scanner(System.in);
		repeticao = sc.nextInt();
		for(int i = 0; i < repeticao; i++) {
			val1 = sc.nextDouble();
			val2 = sc.nextDouble();
			val3 = sc.nextDouble();
			
			media = (val1 * 2 + val2 *3 + val3 * 5) / 10;
			System.out.printf("%.1f%n", media);
		}
		sc.close();
	}

}
