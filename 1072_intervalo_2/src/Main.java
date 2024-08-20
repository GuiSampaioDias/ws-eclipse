import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int dentro = 0, fora = 0, N, valor;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for(int i = 0; i < N; i ++) {
			valor = sc.nextInt();
			if(valor < 10 || valor > 20) {
				fora ++;
			}
			else {
				dentro ++;
			}
		}
		System.out.printf("%d in%n%d out%n", dentro, fora);
		
		sc.close();
	}

}
