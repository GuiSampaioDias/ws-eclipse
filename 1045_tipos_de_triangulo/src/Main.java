import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		String valores = sc.nextLine();
		String[] valor = valores.split(" ");
		sc.close();
		
		double  A, B, C, a, b, c;
		
		double val1 = Double.parseDouble(valor[0]);
		double val2 = Double.parseDouble(valor[1]);
		double val3 = Double.parseDouble(valor[2]);
		
		if(val1 >= val2 && val1 >= val3) {
			a = val1;
			b = val2;
			c = val3;
		}
		else if(val2 >= val3 && val2 >= val1) {
			a = val2;
			b = val1;
			c = val3;
		}
		else{
			a = val3;
			b = val1;
			c = val2;
		}
		
		String triangulo = "";
		A = Math.pow(a, 2.0);
		B = Math.pow(b, 2.0);
		C = Math.pow(c, 2.0);
		
		if( a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else {
			if(A == B + C) {
				triangulo = "RETANGULO";
				System.out.printf("TRIANGULO %s%n", triangulo);
			}
			if(A > B + C) {
				triangulo = "OBTUSANGULO";
				System.out.printf("TRIANGULO %s%n", triangulo);
			}
			if(A < B + C) {
				triangulo = "ACUTANGULO";
				System.out.printf("TRIANGULO %s%n", triangulo);
			}
			if(a == b && b == c ) {
				triangulo = "EQUILATERO"; 
				System.out.printf("TRIANGULO %s%n", triangulo);
			}
			if((a == b && b != c) || (a == c && b != a) || (c == b && b != a)) {
				triangulo = "ISOSCELES";
				System.out.printf("TRIANGULO %s%n", triangulo);
				
			}
		}
	}

}
