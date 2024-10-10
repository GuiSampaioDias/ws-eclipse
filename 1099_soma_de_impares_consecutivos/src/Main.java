import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x, y, maior, menor;
		for(int i = 0; i < N; i ++) {
			x = sc.nextInt();
			y = sc.nextInt();
			if( x == y) {
				System.out.println(0);
			}else {
				maior = Math.max(x, y);
				menor = Math.min(x, y);
				int total = 0;
				for(int n = menor + 1; n < maior; n ++) {
					if (n % 2 == 1) {
						total += n;
					}
				}
				System.out.println(total);
			}
			
			
		}
		
		
		sc.close();
	}

}
