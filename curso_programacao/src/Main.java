import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 38;
		double x = 97.1;
		String nome = "Guilherme";
		System.out.println(y);
		System.out.printf("Olá, meu nome é %s tenho %.2f anos.%n", nome, x);
		Locale.setDefault(Locale.US);
		System.out.printf("Olá, meu nome é Guilherme tenho " + y + " anos e peso %.2f%n Kg", x);
		// %s - para formatar texto
		// %f - ponto flutante
		// %d - para formatar em número inteiro
		// %n - quebra de linha 
		// %.2f %n Para formata números quebrados
		
	}

}
