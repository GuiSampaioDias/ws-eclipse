import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media, valor = 0.0, valor_total = 0.0;
		int positivos = 0;
		
		for(int i = 0; i < 6; i++) {
			valor = sc.nextDouble();
			if(valor > 0 ) {
				valor_total += valor;
				positivos += 1;
			}
		}
		media = valor_total / positivos;
		System.out.printf("%d valores positivos%n%.1f%n", positivos, media);
		
		sc.close();
	}

}
