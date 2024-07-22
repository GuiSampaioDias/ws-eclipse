import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valor = sc.nextLine();
		sc.close();
		
		String[] valores = valor.split(" ");
		int hora_inicio = Integer.parseInt(valores[0]);
		int minuto_inicio = Integer.parseInt(valores[1]);
		int hora_fim = Integer.parseInt(valores[2]);
		int minuto_fim = Integer.parseInt(valores[3]);
		
		int duracao_total_minutos;
		
		int inicio_total_minutos = 60 * hora_inicio + minuto_inicio;
		int fim_total_minutos = 60 * hora_fim + minuto_fim;
		
		if(fim_total_minutos > inicio_total_minutos) {
			duracao_total_minutos = fim_total_minutos - inicio_total_minutos;
		}
		else {
			duracao_total_minutos = (24 * 60 - inicio_total_minutos) + fim_total_minutos;
		}
		int duracao_horas = duracao_total_minutos / 60;
		int duracao_minutos = duracao_total_minutos % 60;
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracao_horas, duracao_minutos);
		

	}

}
