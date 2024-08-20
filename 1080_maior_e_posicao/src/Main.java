import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int maior, linha = 1, valor;
		Scanner sc = new Scanner(System.in);
		maior = sc.nextInt();
		for(int i = 2; i <= 100; i++) {
			valor = sc.nextInt();
			if(valor > maior) {
				maior = valor;
				linha = i;
			}
		}
		System.out.printf("%d%n%d%n", maior, linha);
		sc.close();
	}

}
