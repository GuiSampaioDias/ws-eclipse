
public class Main {
	public static void main(String[] args) {
		for(int i  = 1; i <= 9; i += 2 ) {
			int j = 7;
			for(int n = 0; n < 3; n++) {
				System.out.printf("I=%d J=%d%n", i, j);
				j--;
			}
		}

	}

}
