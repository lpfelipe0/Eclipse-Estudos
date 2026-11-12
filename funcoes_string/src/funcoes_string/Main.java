package funcoes_string;

public class Main {
	public static void main(String[] args) {
		{
		String original = "abcde FGHIJ ABC abc DEFG 	"; //Cria uma String com o texto original
		
		String s01 = original.toLowerCase(); //Converte todo o texto para letras minúsculas
		String s02 = original.toUpperCase(); //Converte todo o texto para letras maiúsculas
		String s03 = original.trim(); //Remove os espaços do início e do final do texto
		String s04 = original.substring(2); //Recorta o texto a partir da posição 2
		String s05 = original.substring(2, 9); //Recorta o texto da posição 2 até a posição 8
		String s06 = original.replace('a', 'x'); //Substitui todas as letras 'a' por 'x'
		String s07 = original.replace("abc", "xy"); //Substitui todas as ocorrências de "abc" por "xy"
		int i = original.indexOf("bc"); //Retorna a posição da primeira ocorrência de "bc"
		int j = original.lastIndexOf("bc"); //Retorna a posição da última ocorrência de "bc"
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
						
	}

//}

String s = "vou escrever um texto em linha reta e o código vai quebrar as linhas"; // Cria uma variável String que armazena uma frase.
String[] vect = s.split(" "); // Divide a frase em várias partes usando o espaço como separador.
//Cada palavra é armazenada em uma posição do vetor (array).

System.out.println(vect[0]);
System.out.println(vect[1]);
System.out.println(vect[2]);
System.out.println(vect[3]);
System.out.println(vect[4]);
System.out.println(vect[5]);
System.out.println(vect[6]);
System.out.println(vect[7]);
System.out.println(vect[8]);
System.out.println(vect[9]);
System.out.println(vect[10]);
System.out.println(vect[11]);
System.out.println(vect[12]);
System.out.println(vect[13]);
	}
}




//Isso é um resumo de funções para manipular Strings (textos) na programação. Serve para modificar, cortar, substituir e procurar partes de um texto.

//1. Formatar textos
//Serve para mudar a aparência do texto.
//- toLowerCase() – transforma tudo em letras minúsculas.
//  - "OLA" → "ola"
//- toUpperCase() – transforma tudo em letras maiúsculas.
//  - "ola" → "OLA"
//- trim() – remove espaços do começo e do final.
//  - "  oi  " → "oi"
//2. Recortar textos
//Serve para pegar apenas uma parte do texto.
//- substring(inicio) – pega o texto a partir de uma posição.
//  - "Computador".substring(3) → "putador"
//- substring(inicio, fim) – pega o texto entre duas posições.
//  - "Computador".substring(0, 4) → "Comp"
//3. Substituir textos
//Serve para trocar caracteres ou palavras.
//- replace(char, char) – substitui um caractere por outro.
//  - "banana".replace("a", "o") → "bonono"
//- replace(string, string) – substitui uma palavra ou sequência por outra.
//  - "Olá mundo".replace("mundo", "pessoal") → "Olá pessoal"
//4. Buscar textos
//Serve para encontrar a posição de uma letra ou palavra.
//- indexOf() – encontra a primeira ocorrência.
 // - "banana".indexOf("a") → 1
//- lastIndexOf() – encontra a última ocorrência.
//  - "banana".lastIndexOf("a") → 5
//5. Dividir textos
//- split(" ") – divide um texto em várias partes usando o espaço como separador.

//Exemplo:

//"João Maria Pedro".split(" ")

//Resultado:
//- João
//- Maria
//- Pedro
