package switch_case;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
			Scanner sc= new Scanner(System.in);
//			int x = sc.nextInt();
//			String dia;
//
//			if( x== 1) {
//				dia = "domingo";
//			}
//			else if (x == 2) {
//				dia = "segunda";
//			}
//			else if(x == 3) {
//				dia = "terca";
//			}
//			else if(x == 4) {
//				dia = "quarta";
//			}
//			else if(x == 5) {
//				dia = "quinta";
//			}
//			else if(x == 6) {
//				dia = "sexta";
//			}
//			else if(x == 7) {
//				dia = "sabado";
//			}
//			else {
//				dia = "valor invalido";
//			}
//			System.out.println("Dia da semana: "+ dia);
//			sc.close();
	//A primeira estrutura acima é um encadeamento de vários elseif, e a outra, é uma opção com o switch case.
	//Esta segunda, é uma opção de switch, pode tornar a estrutura mais organizada, mas não serve para casos muito complexos, a escolha deve ser feita da forma correta.
		
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		String dia;
		
//		switch (x) {
//		case 1:
//			dia= "domingo";
//		break;
//		case 2:
//			dia= "segunda";
//		break;
//		case 3:
//			dia= "terca";
//		break;
//		case 4:
//			dia= "quarta";
//		break;
//		case 5:
//			dia= "quinta";
//		break;
//		case 6:
//			dia= "sexta";
//		break;
//		case 7:
//			dia= "sabado";
//		break;
//		default:
//			dia= "valor invalido";
//			break;
//		}
//		System.out.println("Dia da semana: "+ dia);
//		sc.close();
//	}
//}

//Usar IF / ELSE IF quando:
//- Precisa verificar intervalos.
//- Precisa combinar condições.
//- Precisa fazer comparações diferentes.
//- A decisão depende de regras de negócio mais elaboradas.

//Use SWITCH / CASE quando:
//- Tem várias opções fixas.
//- Está criando menus de sistemas.
//- Precisa identificar comandos.
//- Está trabalhando com dias, estados ou categorias representados por valores específicos.

//Um detalhe adicional: tanto o if/else if quanto o switch podem avaliar expressões em sequência. Portanto, a escolha também deve considerar a clareza do código e a facilidade de manutenção.
		
			
		//Logo abaixo: Outro exemplo, neste caso, é a expressão condicional ternária
		//Ela se baseia em resultados de condições, se um falor for verdadeiro, apresente um resultado X, se for Falso, apresente o resultado Y por exemplo.
		
		//Duas opções para teste. A primeira:
		 
	//	double preco = 34.5;
	//	double desconto;
	//	if (preco < 20.0) {
	//		desconto = preco * 0.1;
	//	}
	//	else {
	//		desconto = preco * 0.05;
	//	}
	//	
	//	System.out.println(desconto);
		
	//	sc.close();
			
			//Agora o mesmo código anterior, porém, em condição ternária:
			
			double preco = 34.5;
			double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
						
			System.out.println(desconto);
			
			sc.close();			
		}		
}