import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] meses = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		Scanner sc = new Scanner(System.in);
		int posicao = sc.nextInt();
		System.out.println(meses[posicao - 1]);
		sc.close();

	}

}
