//Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit
//Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
//Fórmula: F = 9c/5 + 32.
package celsiusxfahrenheit;
import java.util.Locale;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Código do Nélio Alves: 
//		char resposta;
//		do {
//			System.out.println("Digite a temperatura em Celsius: ");
//			double C = sc.nextDouble();
//			double F = 9.0 * C / 5.0 + 32.0;
//			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
//			System.out.print("Deseja repetir (s/n)? ");
//			resposta = sc.next().charAt(0);
//		} while (resposta != 'n');
		
//	sc.close();
		
//Encontrei um problema no código do Nélio, o programa não trabalha de forma literária conforme proposto.
		//Notei que quando ele entra no looping e questiona se deseja repetir, ao digitar "n" ele encerra corretamente.
		//Porém, no lugar de s, se eu digitar qualquer outra coisa que não seja S ou N, ele volta no looping como se eu tivesse digitado "S"
		//Minha ideia foi fazer o sistema trabalhar de forma literária com a proposta, corrigindo a abertura para a digitação de qualquer caractere no lugar do "S" durante a condição S/N.
		//A solução encontrada abaixo faz com que a pergunta fique limitada a S/N de fato:
		
		String resposta; //Armazena a resposta do usuário (s/n).
        double C; //Armazena a temperatura em Celsius.

        do {
            // Validação da temperatura
            while (true) {
            	//Cria um laço que só termina quando receber um número válido.
                System.out.print("Digite a temperatura em Celsius: ");
                
                if (sc.hasNextDouble()) {
                	//Verifica se o próximo dado digitado é um número decimal.
                    C = sc.nextDouble();
                 //Lê o número digitado e armazena na variável C.
                    break;
                 //Interrompe o while quando encontra um número válido.
                } else {
                    System.out.println("Entrada inválida! Digite um número.");
                    sc.next();
                 //Descarta a entrada inválida para permitir uma nova tentativa.
                }
            }
            //CÁLCULO DA CONVERSÃO
            double F = 9.0 * C / 5.0 + 32.0;
            //Converte a temperatura de Celsius para Fahrenheit.
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            //Exibe o resultado com uma casa decimal.
            
            //VALIDAÇÃO DA RESPOSTA (S/N)
            do {
                System.out.print("Deseja repetir (s/n)? ");
                resposta = sc.next().toLowerCase();
             //Lê a resposta e transforma letras maiúsculas em minúsculas.
                
                if (!resposta.equals("s") && !resposta.equals("n")) {
           	//Verifica se a resposta é diferente de "s" e também de "n".       
                	System.out.println("Resposta inválida! Digite apenas s ou n.");
                    
                }
            } while (!resposta.equals("s") && !resposta.equals("n"));
            //Repete a pergunta enquanto a resposta não for s ou n.
        } while (resposta.equals("s"));
        //Repete toda a conversão enquanto o usuário responder s.
        System.out.println("Programa encerrado!");
        sc.close();
        //Fecha o Scanner e libera o recurso utilizado para leitura.
    }
}
