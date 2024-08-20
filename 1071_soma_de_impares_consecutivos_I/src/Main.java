import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int total = 0;
		int maior, menor;
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.nextLine();
		int Y = sc.nextInt();
		
		maior = Math.max(X, Y);
		menor = Math.min(X, Y);
		
		if(menor != maior) {
			for(int i = menor + 1; i < maior; i++) {
				if(i % 2 != 0) {
					total += i;
				}
			}
		}
		System.out.println(total);

	}

}
