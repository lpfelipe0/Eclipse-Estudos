package quarto_projeto;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
			System.out.println("Que Horas São Man? O.o");
		hora = sc.nextInt();

		if (hora <= 12) {
			System.out.println("Bom dia Camisinho");
		}
		
		else if (hora < 18) {
				System.out.println("Então ainda não é de noite Beringelo");	
		}
		
		else {
				System.out.println("Perfeito man, obrigado e boa noite Meu Bob Goods");	
		}
		
		sc.close();
}
	
}
