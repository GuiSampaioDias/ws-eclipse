import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		if(valor % 2 == 0) {
			valor ++;
		}
		for(int i = 0; i < 6; i ++) {
			System.out.println(valor);;
			valor += 2;
		}
		sc.close();
	}
}
