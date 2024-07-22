import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valor = sc.nextLine();
		String[] valores = valor.split(" ");
		int valor1 = Integer.parseInt(valores[0]);
		int valor2 = Integer.parseInt(valores[1]);
		int valor3 = Integer.parseInt(valores[2]);
		int maior, meio, menor;
		sc.close();
		
		
		if (valor1 > valor2 && valor1 > valor3) {
			maior = valor1;
			if(valor2 > valor3) {
				meio = valor2;
				menor = valor3;
			}
			else {
				meio = valor3;
				menor = valor2;
			}
		}
		else if(valor2 > valor1 && valor2 > valor3) {
			maior = valor2;
			if(valor1 > valor3) {
				meio = valor1;
				menor = valor3;
			}
			else {
				meio = valor3;
				menor = valor1;
			}
		}
		else {
			maior = valor3;
			if(valor1 > valor2) {
				meio = valor1;
				menor = valor2;
			}
			else {
				meio = valor2;
				menor = valor1;
			}
		}
		System.out.printf("%d%n%d%n%d%n%n",menor, meio, maior);
		System.out.printf("%d%n%d%n%d%n",valor1, valor2, valor3);
	}

}
