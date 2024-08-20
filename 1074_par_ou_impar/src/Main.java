import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N, valor;
		String result, x,var_impar_par, var_neg_posi;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			valor = sc.nextInt();
			if(valor == 0) {
				System.out.println("NULL");
			}
			else {
				if(valor % 2 == 0 ) {
					var_impar_par = "EVEN ";
				}
				else {
					var_impar_par = "ODD ";
				}
				if(valor > 0) {
					var_neg_posi = "POSITIVE";
				}
				else {
					var_neg_posi = "NEGATIVE";
				}
				System.out.println(var_impar_par + var_neg_posi);
			}
			
		}
		sc.close();
	}

}
