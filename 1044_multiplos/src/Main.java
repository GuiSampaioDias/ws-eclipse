import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String valor = sc.nextLine();
		String[] valores = valor.split(" ");
		
		sc.close();
		
		int valor1 = Integer.parseInt(valores[0]);
		int valor2 = Integer.parseInt(valores[1]);
		
		if((double)valor1 % valor2 ==0 || (double)valor2 % valor1 == 0 ) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
	}

}
