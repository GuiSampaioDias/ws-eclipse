import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tipo1 = sc.nextLine();
		String tipo2 = sc.nextLine();
		String tipo3 = sc.nextLine();
		sc.close();

		
		String res = "nada";
		
		if(tipo1.equals("vertebrado")) {
			if(tipo2.equals("ave")) {
				if(tipo3.equals("carnivoro")) {
					res = "aguia";
				}
				else if(tipo3.equals("onivoro")) {
					res = "pomba";
				}
			}
			else if(tipo2.equals("mamifero")) {
				if(tipo3.equals("onivoro")) {
					res = "homem";
				}
				else if(tipo3.equals("herbivoro")) {
					res = "vaca";
				}
			}
		}
		else if(tipo1.equals("invertebrado")) {
			if(tipo2.equals("inseto")) {
				if(tipo3.equals("hematofago")) {
					res = "pulga";
				}
				else if(tipo3.equals("herbivoro")) {
				res = "lagarta";
				}
			}
			else if(tipo2.equals("anelideo")) {
				if(tipo3.equals("hematofago")) {
					res = "sanguessuga";
				}
				else if(tipo3.equals("onivoro")) {
					res = "minhoca";
				}
			}
		}
		System.out.println(res);

	}

}
