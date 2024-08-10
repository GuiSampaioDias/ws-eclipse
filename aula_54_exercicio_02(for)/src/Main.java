import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidade = sc.nextInt();
		int valor, dentro = 0, fora = 0;
		for(int i = 0;i < quantidade; i++) {
			valor = sc.nextInt();
			if(valor >= 10 && valor <= 20) {
				dentro += 1;
			}
			else {
				fora += 1;
			}
		}
		System.out.printf("%d in%n%d out%n", dentro, fora);
		sc.close();
	}

}
