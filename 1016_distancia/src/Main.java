import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total;
		int valor = sc.nextInt();
		total = valor * 2;
		
		System.out.printf("%d minutos%n", total);
		
		sc.close();
	}

}
