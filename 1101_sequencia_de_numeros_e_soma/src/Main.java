import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x, y, maior, menor;
        
        while (true) {  // Loop infinito até condição de parada
            x = sc.nextInt();
            y = sc.nextInt();
            
            if (x <= 0 || y <= 0) {
                break;  // Condição de parada: se x ou y for menor ou igual a zero
            }
            
            int total = 0;
            maior = Math.max(x, y);
            menor = Math.min(x, y);
            
            for (int i = menor; i <= maior; i++) {
                total += i;
                System.out.print(i + " ");
            }
            
            System.out.println("Sum=" + total);
        }
        
        sc.close();
	}

}
