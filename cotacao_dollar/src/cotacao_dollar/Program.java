package cotacao_dollar;

import java.util.Locale;
import java.util.Scanner;
import classes.Conversor;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Mostra a pergunta e recebe o preço do dólar.
		System.out.println("Qual é o preço do Dollar? ");
		double dollarPriece = sc.nextDouble();

		// Mostra a pergunta e recebe a quantidade de dólares.
		System.out.println("Quantos Dollar se vai comprar? ");
		double dollars = sc.nextDouble();

		/*Chama o método dollarToReal da classe Conversor,
      	enviando o preço e a quantidade de dólares.
      	O resultado retornado é armazenado na variável result.*/
		double result = Conversor.dollarToReal(dollarPriece, dollars);

		// Mostra o resultado final com duas casas decimais.
		System.out.printf("Então se vai pagar a bagatela de: %.2f%n", + result);

		// Fecha o Scanner após terminar as leituras.
		sc.close();
	}
}