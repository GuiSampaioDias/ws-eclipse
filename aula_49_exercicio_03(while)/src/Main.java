import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tipo_de_combustivel = sc.nextInt();
		int alcool = 0, gasolina = 0, diesel = 0;
		
		while(tipo_de_combustivel != 4) {
			if (tipo_de_combustivel == 1) {
				alcool +=1;
			}
			else if(tipo_de_combustivel == 2) {
				gasolina += 1;
			}
			else if(tipo_de_combustivel == 3) {
				diesel += 1;
			}
			tipo_de_combustivel = sc.nextInt();
		}
		System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n",alcool, gasolina, diesel);	
		sc.close();
	}

}
