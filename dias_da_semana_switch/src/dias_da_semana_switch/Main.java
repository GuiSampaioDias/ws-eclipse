package dias_da_semana_switch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.close();
		
		String dia_da_semana;
		
		switch(numero) {
		
		case 1:
			dia_da_semana = "Domingo";
			break;
		case 2:
			dia_da_semana = "Segunda-feira";
			break;
		case  3:
			dia_da_semana = "Terça-feira";
			break;
		case  4:
			dia_da_semana = "Quarta-feira";
			break;
		case  5:
			dia_da_semana = "Quinta-feira";
			break;
		case  6:
			dia_da_semana = "Sexta-feira";
			break;
		case  7:
			dia_da_semana = "Sabado";
			break;
		default:
			dia_da_semana = "Valor invalido";
		}
		System.out.println("Dia da semana: " + dia_da_semana);

	}

}
