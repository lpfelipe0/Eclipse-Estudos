package aplicattion;

// Importações necessárias
import java.util.Locale;
import java.util.Scanner;

// Importa a classe Product, que está em outro pacote
import entities.Product;

public class Program {

    public static void main(String[] args) {

        // ==========================================
        // 1. CONFIGURAÇÕES INICIAIS
        // ==========================================

        // Define o padrão americano para números decimais
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para receber dados do usuário
        Scanner sc = new Scanner(System.in);


        // ==========================================
        // 2. ENTRADA DOS DADOS
        // ==========================================

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();


        // ==========================================
        // 3. CRIAÇÃO DO OBJETO
        // ==========================================

        // Cria um produto utilizando o construtor
        // que recebe apenas nome e preço.
        // A quantidade será iniciada automaticamente em zero.

        Product product = new Product(name, price);


        // ==========================================
        // 4. EXIBIÇÃO DOS DADOS
        // ==========================================

        System.out.println();

        System.out.println("Product data: " + product);


        // ==========================================
        // 5. ADICIONANDO PRODUTOS AO ESTOQUE
        // ==========================================

        System.out.println();

        System.out.print("Enter the number of products to be added: ");

        int quantity = sc.nextInt();

        // Chama o método addProducts() da classe Product
        product.addProducts(quantity);


        // Exibe os dados atualizados
        System.out.println();

        System.out.println("Updated data: " + product);


        // ==========================================
        // 6. REMOVENDO PRODUTOS DO ESTOQUE
        // ==========================================

        System.out.println();

        System.out.print("Enter the number of products to be removed: ");

        quantity = sc.nextInt();

        // Chama o método removeProducts() da classe Product
        product.removeProducts(quantity);


        // Exibe os dados atualizados
        System.out.println();

        System.out.println("Updated data: " + product);


        // ==========================================
        // 7. ENCERRAMENTO
        // ==========================================

        sc.close();

    }

}




/*1
Program.java

O usuário digita os dados:
String name = sc.nextLine();
double price = sc.nextDouble();
Envia os valores para o construtor


2
Product.java

O objeto é criado:
Product product = new Product(name, price);
O construtor executa:
this(name, price, 0);
E inicializa os atributos.
O objeto está pronto para ser utilizado

3
Program.java

Chama os métodos:
product.addProducts(quantity);
product.removeProducts(quantity);
Os métodos modificam os atributos internos

4
Product.java

O método toString() apresenta os dados atualizados:
System.out.println(product);

======================================================================
Encapsulamento: atributos private.
Construtores: inicialização dos objetos.
Sobrecarga: diferentes maneiras de criar um objeto.
This: referência ao próprio objeto e chamada de outro construtor.
Métodos: operações realizadas pelo objeto.
ToString: representação textual do objeto.
======================================================================
*/