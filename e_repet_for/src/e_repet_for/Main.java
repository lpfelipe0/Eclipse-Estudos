package e_repet_for;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int N = sc.nextInt();
		
		int soma = 0;
		  //(Início; Condição; Incremento)
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
			}
		System.out.println(soma);
		sc.close();
	}
}

			//Aqui um exemplo de contagem sequencial, dá pra fazer contagem regressiva invertendo as funções
//for (int i=0; i<5; i++) {
//System.out.println("Posição na Fila: " + i);

//Regressiva, exemplo:
//for (int i=4; i>=0; i--) {
//System.out.println("Valor de i: " +i);
//}

//Esse código utiliza uma estrutura de repetição for para ler N números inteiros, somar todos eles e apresentar o resultado final.

				//Passo a passo
//	1. Scanner sc = new Scanner(System.in);
//   Cria um objeto para ler os dados digitados pelo usuário.
   
//	2. int N = sc.nextInt();
//   Lê a quantidade de números que serão informados.
   
//	3. int soma = 0;
//   Cria uma variável para armazenar a soma, começando em zero.
   
//	4. for (int i=0; i<N; i++)
//   Executa o bloco de código N vezes.   
//   - int i = 0: começa em zero.
//   - i < N: continua enquanto i for menor que N.
//   - i++: incrementa i em 1 a cada repetição.
   
//	5. int x = sc.nextInt();
//   Lê um número inteiro.
   
//	6. soma = soma + x;
//   Adiciona o número digitado ao valor acumulado.
   
//	7. System.out.println(soma);
//   Mostra o resultado da soma.
   
//	8. sc.close();
//   Fecha o Scanner.
   
//Exemplo de execução
//Entrada:
//5
//10
//20
//30
//40
//50

//Saída:
//150


//Entendendo a repetição
//Repetição	Número (x)	Soma
//1ª	10	10
//2ª	20	30
//3ª	30	60
//4ª	40	100
//5ª	50	150

//Resultado final: 150
//A variável soma é um acumulador. Ela guarda o resultado anterior e acrescenta o próximo número a cada repetição.