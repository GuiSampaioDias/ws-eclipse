import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int res = 1;
		for(int i = N; 2 <= i; i--) {
			res *= i; 
		}
		System.out.println(res);
		sc.close();
	}

}
