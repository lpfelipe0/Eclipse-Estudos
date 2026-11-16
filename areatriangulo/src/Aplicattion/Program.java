/* Resolvendo um problema sem orientação a objetos
 Fazer um programa para ler as medidas dos lados de dois triangulos X e Y
 Em seguida mostrar o valor das áreas dos dois triangulos e dizer qual dos 
 dois lados possui a maior area.
  
 A formula para calcular a área de um triangulo a partir das medidas de seus lados
 a, b e c é a formula de Heron:
  
 area = raiz quadrada de p(p-a)(p-b)(p-c) onde p = a+b+c/2.
 */
package Aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Program {

	public static void main(String []args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as medidas do Triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do Triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Area do triangulo X: %.4f%n", areaX);
		System.out.printf("Area do triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("O maior é o triangulo X");
		}
		else {
			System.out.println("O maior é o triangulo Y");
		}
		
		sc.close();
	}
}
