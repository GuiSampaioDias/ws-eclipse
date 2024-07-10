import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); // essa lina tem a funcionalidade de permitir que após inputar o valor do x e der enter, o valor do s1, não fique como o valor de um enter
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
