package exemplo_escopo_inicializacao;

public class Main {

	public static void main(String[] args) {
		
		double price = 400.00;
		double discount;
		
		if (price < 200.00) {
			discount = price * 0.1;
		}
		else {
			discount = 0;
			}
		System.out.println(discount);
			}
}
	
//double price = 400.00; → cria a variável do preço.
//double discount; → declara a variável desconto, mas ainda não atribui valor.
//if (price < 200.00) → verifica se o preço é menor que 200.
//discount = price * 0.1; → se for menor, calcula 10% de desconto.
//else → caso contrário, o desconto será zero.
//System.out.println(discount); → mostra o desconto na tela.


//Escopo: a variável discount foi criada fora do if/else. Portanto, pode ser utilizada dentro e depois desses blocos.
//Inicialização: mesmo tendo sido declarada sem valor inicialmente, ela recebe um valor em todos os caminhos possíveis:
//Se o preço for menor que 200, recebe o cálculo de 10%.
//Caso contrário, recebe zero.
//Assim, o Java consegue garantir que ela terá um valor antes de ser utilizada.
//Guarde esta dica: você não precisa inicializar uma variável exatamente na linha em que a declara. Pode atribuir o valor depois, desde que ela receba um valor antes de ser utilizada.


//Escopo: é o espaço onde uma variável pode ser utilizada. Normalmente, é delimitado pelas chaves { }.
//Declaração: é quando criamos uma variável.

//int idade;

//Inicialização: é quando atribuímos um valor à variável.
//idade = 20;

//Declaração e inicialização juntas:
//int idade = 20;

//Variáveis locais: precisam receber um valor antes de serem utilizadas. Caso contrário, o Java apresenta erro de compilação.

//Variáveis dentro do IF: podem receber valores dentro do bloco, mas só podem ser acessadas fora dele se tiverem sido declaradas em um escopo externo.

//Valores padrão: atributos de uma classe recebem valores automaticamente quando não são inicializados:
//- int = 0
//- double = 0.0
//- boolean = false
//- String = null

//Para memorizar
//Escopo: onde posso usar a variável?
//Inicialização: qual valor foi atribuído à variável?
//Regra principal: nunca utilizar uma variável local antes de inicializá-la.S
//Sempre observar onde a variável foi criada e se ela já recebeu um valor antes de utilizá-la.