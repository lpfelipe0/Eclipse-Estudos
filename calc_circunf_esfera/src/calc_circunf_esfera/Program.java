/*Aqui uma lógica crua, ela receberá outra versão, onde será delegada a tarefa de cálculo*/
package calc_circunf_esfera;

import java.util.Locale;
import java.util.Scanner;
import util.Calculador;

public class Program {

	public static final double PI = 3.14159;
	public static void main(String[] args) {


		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o raio ");
		double raio = sc.nextDouble();

		double c = Calculador.circunferencia(raio);
		double v = Calculador.volume(raio);

		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor do PI : %.2f%n", Calculador.PI);

		sc.close();
	}
}