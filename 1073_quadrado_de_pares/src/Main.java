import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int  N;
		double res;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i = 2;i <= N; i+=2) {
			res = Math.pow(i, 2.0);
			System.out.printf("%d^2 = %d%n",i, (int)res);
		}
		
		
		sc.close();

	}

}
