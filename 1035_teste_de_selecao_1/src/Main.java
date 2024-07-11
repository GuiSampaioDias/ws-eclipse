import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String valores = sc.nextLine();
		String[] valor = valores.split(" ");
		
		int A = Integer.parseInt(valor[0]);
		int B = Integer.parseInt(valor[1]);
		int C = Integer.parseInt(valor[2]);
		int D = Integer.parseInt(valor[3]);
		
		if(B > C && D > A && (C + D) > (B + A) && C > 0 && D > 0 && A % 2 ==0 ) {
		System.out.println("Valores aceitos");	
		}
		else {
			System.out.println("Valores nao aceitos");
		}
		
		sc.close();
		
	}

}
