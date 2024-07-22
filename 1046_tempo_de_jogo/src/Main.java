import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valor = sc.nextLine();
		String[] valores = valor.split(" ");
		sc.close();
		int inicio = Integer.parseInt(valores[0]);
		int fim = Integer.parseInt(valores[1]);
		int horas;
		
		if(inicio == fim) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else {
			if(inicio < fim) {
				horas = fim - inicio;
			}
			else {
				horas = 24 - inicio + fim;
			}
			System.out.printf("O JOGO DUROU %s HORA(S)", horas);
		}
		
	}

}
