import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int total_segundos_dia = 86400;

		int dia_inicio, hora_inicio, minuto_inicio, segundos_inicio;
		int dia_fim, hora_fim, minuto_fim, segundos_fim;
		
		int total_segundos_inicio, total_segundos_fim, total_dias;
		int total_segundos_diferenca = 0, horas_dif = 0, minutos_dif = 0, segundos_dif = 0;
		int var_dinamic;
		
		// Separando nas variaveis todos os valores do inicio do evento(dia, hora, minuto e segundo)
		Scanner sc = new Scanner(System.in);
		
		String var_dinamica = sc.nextLine();
		String[] valores = var_dinamica.split(" ");
		
		dia_inicio = Integer.parseInt(valores[1]);
		
		var_dinamica = sc.nextLine();
		valores = var_dinamica.split(" : ");
		
		hora_inicio = Integer.parseInt(valores[0]);
		minuto_inicio = Integer.parseInt(valores[1]);
		segundos_inicio = Integer.parseInt(valores[2]);
		
		// Separando nas variaveis todos os valores do final do evento (dia, hora, minuto e segundo)
		
		var_dinamica = sc.nextLine();
		valores = var_dinamica.split(" ");
		dia_fim = Integer.parseInt(valores[1]);
		
		var_dinamica = sc.nextLine();
		valores = var_dinamica.split(" : ");
		
		hora_fim = Integer.parseInt(valores[0]);
		minuto_fim = Integer.parseInt(valores[1]);
		segundos_fim = Integer.parseInt(valores[2]);
		
		total_dias = dia_fim - dia_inicio ;
		// Juntando as horas minutos e segundos inicias( em segundos )
		int hora_inicio_seg = hora_inicio * 60 * 60;
		int minuto_inicio_seg = minuto_inicio * 60;
		total_segundos_inicio =  hora_inicio_seg + minuto_inicio_seg + segundos_inicio;
		
		// Juntando as horas minutos e segundos final( em segundos )
		int hora_fim_seg = hora_fim * 60 * 60;
		int minuto_fim_seg = minuto_fim *60;
		total_segundos_fim = hora_fim_seg + minuto_fim_seg + segundos_fim;
		
		if(total_segundos_fim >= total_segundos_inicio) {
			total_segundos_diferenca = total_segundos_fim - total_segundos_inicio;
					
		}
		else {
			total_dias -= 1;
			total_segundos_diferenca = total_segundos_dia - (total_segundos_inicio - total_segundos_fim);
			
		}
		
		horas_dif = total_segundos_diferenca /(60 * 60);
		
		var_dinamic = horas_dif * 3600;
		total_segundos_diferenca -= var_dinamic;
		minutos_dif = total_segundos_diferenca / 60;
		
		var_dinamic = minutos_dif * 60;
		total_segundos_diferenca -= var_dinamic;
		
		segundos_dif = total_segundos_diferenca;	
		
		System.out.println(total_dias + " dia(s)");
		System.out.println(horas_dif + " hora(s)");
		System.out.println(minutos_dif + " minuto(s)");
		System.out.println(segundos_dif + " segundo(s)");
			
		
		sc.close();
	}

}
