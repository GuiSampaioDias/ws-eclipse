import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String notas = sc.nextLine();
		String[] nota = notas.split(" ");
		
		
		double nota1 = Double.parseDouble(nota[0]) * 2.0;
		double nota2 = Double.parseDouble(nota[1]) * 3.0;
		double nota3 = Double.parseDouble(nota[2]) * 4.0;
		double nota4 = Double.parseDouble(nota[3]) * 1.0;
		double media  = (nota1 + nota2 + nota3 + nota4) / 10.0;
		
		media = Math.floor(media * 10) / 10.0;
		
		System.out.printf("Media: %.1f%n", media);
		if(media >= 7) {
			System.out.println("Aluno aprovado.");
		}
		else if(media >= 5) {
			System.out.println("Aluno em exame.");
			double exame = sc.nextDouble();
			System.out.printf("Nota do exame: %.1f%n", exame);
			media = (media + exame) / 2.0;
			media = Math.floor(media * 10) / 10.0;
			if(media >= 5) {
				System.out.println("Aluno aprovado.");
			}else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f%n", media);
		}
		else {
			System.out.println("Aluno reprovado.");
		}
		
		sc.close();
	}

}
