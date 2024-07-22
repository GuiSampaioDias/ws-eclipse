import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ddd = sc.nextInt();
		sc.close();
		
		String destino = "DDD nao cadastrado" ;
		
		if(ddd == 61) {
			destino = "Brasilia";
		}
		else if(ddd == 71) {
			destino = "Salvador";
		}
		else if(ddd == 11) {
			destino = "Sao Paulo";
		}
		else if(ddd == 21) {
			destino = "Rio de Janeiro";
		}
		else if(ddd == 32) {
			destino = "Juiz de Fora";
		}
		else if(ddd == 19) {
			destino = "Campinas";
		}
		else if(ddd == 27) {
			destino = "Vitoria";
		}
		else if(ddd == 31){
			destino = "Belo Horizonte";
		}
		System.out.println(destino);

	}

}
