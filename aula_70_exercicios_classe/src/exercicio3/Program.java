package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		aluno.name = sc.nextLine();
		aluno.grade1 = sc.nextDouble();
		aluno.grade2 = sc.nextDouble();
		aluno.grade3 = sc.nextDouble();
		
		System.out.println(aluno);
		
		sc.close();
	}

}
