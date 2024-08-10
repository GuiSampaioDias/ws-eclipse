import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total_positivos = 0;
		double valor;
		for(int i = 0; i < 6; i++) {
			valor = sc.nextDouble();
			if(valor > 0) {
				total_positivos += 1;
			}
		}
		System.out.printf("%d valores positivos\n", total_positivos);
		sc.close();
	}

}
