import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double res1, res2, total;
		
		String linha1 = sc.nextLine();
		String linha2 = sc.nextLine();
		
		String[] x = linha1.split(" ");
		String[] y = linha2.split(" ");
		
		double x1 = Double.parseDouble(x[0]);
		double y1 = Double.parseDouble(x[1]);
		double x2 = Double.parseDouble(y[0]);
		double y2 = Double.parseDouble(y[1]);
		
		res1 = Math.pow((x2 - x1), 2.0);
		res2 = Math.pow((y2 - y1), 2.0);
		total = Math.sqrt(res1 + res2);
		
		System.out.printf("%.4f%n", total);
		
		sc.close();
	}

}
