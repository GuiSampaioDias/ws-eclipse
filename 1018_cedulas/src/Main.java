import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int total = sc.nextInt();
		
		System.out.println(total);
		
		System.out.printf("%d nota(s) de R$ 100,00%n", total / 100);
		total -= (total / 100 * 100);
		
		System.out.printf("%d nota(s) de R$ 50,00%n", total / 50);
		total -=  (total / 50 * 50);
		
		System.out.printf("%d nota(s) de R$ 20,00%n", total / 20);
		total -= (total / 20 * 20);
		
		System.out.printf("%d nota(s) de R$ 10,00%n", total / 10);
		total -= (total / 10 * 10);
		
		System.out.printf("%d nota(s) de R$ 5,00%n",total / 5);
		total -= (total / 5 * 5);
		
		System.out.printf("%d nota(s) de R$ 2,00%n", total / 2);
		total -= (total / 2 * 2);
		
		System.out.printf("%d nota(s) de R$ 1,00%n", total);
		
		sc.close();
	}

}
