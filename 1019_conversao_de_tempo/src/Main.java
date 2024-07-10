import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horas, minutos, segundos;
		
		int total = sc.nextInt();
		
		horas = total / 3600;
		total -= (total / 3600 * 3600);
		
		minutos = total / 60;
		segundos = total - total / 60 * 60; 
		System.out.printf("%d:%d:%d%n",horas, minutos,segundos);

		sc.close();
	}

}
