import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		String pontos = sc.nextLine();
		String[] ponto = pontos.split(" ");
		sc.close();
		
		String res;
		double x = Double.parseDouble(ponto[0]);
		double y = Double.parseDouble(ponto[1]);
		
		if(x == 0 && y == 0) {
			res = "Origem";
		}
		else if(x == 0) {
			res = "Eixo Y";
		}
		else if(y ==0) {
			res = "Eixo X";
		}
		else if( x > 0 && y > 0 ) {
			res = "Q1";
		}
		else if(y > 0 && x < 0) {
			res = "Q2";
		}
		else if(y < 0 && x < 0) {
			res = "Q3";
		}
		else {
			res = "Q4";
		}
		System.out.println(res);
	}

}
