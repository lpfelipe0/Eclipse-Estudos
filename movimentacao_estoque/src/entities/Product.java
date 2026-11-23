//Essa classe fica responsável por armazenar os dados do produto e realizar as operações sobre ele.
package entities;

// Classe que representa um produto
public class Product {

    // ==========================================
    // 1. ATRIBUTOS (DADOS DO PRODUTO)
    // ==========================================

    private String name;
    private double price;
    private int quantity;


    // ==========================================
    // 2. CONSTRUTORES (SOBRECARGA)
    // ==========================================

    // Construtor 1: recebe todos os dados
    public Product(String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    // Construtor 2: recebe nome e preço
    // A quantidade começa automaticamente em zero
    public Product(String name, double price) {

        this(name, price, 0);

    }


    // ==========================================
    // 3. MÉTODOS DE OPERAÇÃO DO ESTOQUE
    // ==========================================

    // Calcula o valor total em estoque
    public double totalValueInStock() {

        return price * quantity;

    }

    // Adiciona produtos ao estoque
    public void addProducts(int quantity) {

        this.quantity += quantity;

    }

    // Remove produtos do estoque
    public void removeProducts(int quantity) {

        this.quantity -= quantity;

    }


    // ==========================================
    // 4. GETTERS E SETTERS
    // ==========================================

    // Retorna o nome do produto
    public String getName() {

        return name;

    }

    // Altera o nome do produto
    public void setName(String name) {

        this.name = name;

    }


    // Retorna o preço
    public double getPrice() {

        return price;

    }

    // Altera o preço
    public void setPrice(double price) {

        this.price = price;

    }


    // Retorna a quantidade em estoque
    public int getQuantity() {

        return quantity;

    }

    // Altera a quantidade em estoque
    public void setQuantity(int quantity) {

        this.quantity = quantity;

    }


    // ==========================================
    // 5. MÉTODO TOSTRING
    // ==========================================

    // Define como o objeto será apresentado
    // quando utilizarmos System.out.println(product)
    @Override
    public String toString() {

        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f", totalValueInStock());

    }

}