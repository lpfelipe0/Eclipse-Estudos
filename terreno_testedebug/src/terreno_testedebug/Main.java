package terreno_testedebug;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		double largura = sc.nextDouble();
//		double comprimento = sc.nextDouble();
//		double metroQuadrado = sc.nextDouble();

//		double area = largura * comprimento;
//		double preco = area * metroQuadrado;

//		System.out.printf("AREA = %.2f%n", area);
//		System.out.printf("PRECO = %.2f%n", preco);
		
//Fazer um programa que lê números inteiros	até que um zero seja lido.
//Ao final, mostra a soma dos números lidos.
		//Estrutura While é uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.
		//Quando não se sabe previamente a quantidade de repetições que será realizada, pode ser aplicada a estrutura While.
		int x = sc.nextInt();
		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		System.out.println(soma);
		sc.close();
	}
}

