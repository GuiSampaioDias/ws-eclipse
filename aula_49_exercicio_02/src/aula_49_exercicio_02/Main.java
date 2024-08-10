package aula_49_exercicio_02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  xy = sc.nextLine();
		String[] valores = xy.split(" ");
		int x = Integer.parseInt(valores[0]);
		int y = Integer.parseInt(valores[1]);
		String res;
		
		while(x != 0 && y != 0) {
			if (x > 0 ) {
				if(y > 0) {
					res = "primeiro";
				}
				else {
					res = "quarto";
				}
			}
			else {
				if(y > 0) {
					res = "segundo";
				}
				else {
					res = "terceiro";
				}
			}
			
			System.out.println(res);
			x = sc.nextInt();
			y = sc.nextInt();
			//xy = sc.nextLine();
			//valores = xy.split(" ");
			//x = Integer.parseInt(valores[0]);
			//y = Integer.parseInt(valores[1]);
			
		}
		
		sc.close();
		
	}

}
