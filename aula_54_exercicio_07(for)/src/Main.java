import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			double quadrado = Math.pow(i, 2);
			double cubo = Math.pow(i, 3);
			System.out.printf("%d %d %d%n", i, (int)quadrado, (int)cubo);
		}
		sc.close();
	}

}
