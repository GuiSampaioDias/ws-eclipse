import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int res;

		for (int i = 1; i <= 10; i++) {
			res = N * i;
			System.out.printf("%d x %d = %d%n", i, N, res);
		}

		sc.close();
	}

}
