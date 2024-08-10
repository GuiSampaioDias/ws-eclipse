import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantidade = sc.nextInt();
		double res, val1, val2;
		
		for(int i = 0; i < quantidade; i++) {
			val1 = sc.nextDouble();
			val2 = sc.nextDouble();
			
			if(val2 == 0) {
				System.out.println("divisão impossivel");
			}
			else {
				res = val1 / val2;
				System.out.printf("%.1f%n", res);
			}
		
		}



		sc.close();
	}
	
	
}
