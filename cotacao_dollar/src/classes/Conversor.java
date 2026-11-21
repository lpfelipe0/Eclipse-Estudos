package classes;

public class Conversor {

	// Recebe o preço do dólar e a quantidade desejada.
	public static double dollarToReal(double dollarPrice, double dollars) {

		// Multiplica o preço do dólar pela quantidade.
		double total = dollarPrice * dollars;

		// Calcula 6% de IOF sobre o valor da compra.
		double iof = total * 0.06;

		// Retorna o valor total somado ao IOF.
		return total + iof;
	}
}