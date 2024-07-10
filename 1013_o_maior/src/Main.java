import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String linha = sc.nextLine();
		String[] valores = linha.split(" ");
		
		int maior1, maior2;
		
		int valor1 = Integer.parseInt(valores[0]);
		int valor2 = Integer.parseInt(valores[1]);
		int valor3 = Integer.parseInt(valores[2]);
		
		maior1 = (valor1 + valor2 + Math.abs(valor1 - valor2)) / 2;
		maior2 = (maior1 + valor3 + Math.abs(maior1 - valor3)) / 2;
		
		System.out.printf("%d eh o maior%n", maior2);
		
		sc.close();
	}

}
