package aula_73_exercicio_static;

public class CotacaoDolar {
	public static final double tax = 1.06;
	
	public static double cotacao(double price, double quantity) {
		return price * quantity * tax;
	}
}
