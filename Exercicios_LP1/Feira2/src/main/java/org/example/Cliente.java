package org.example;

public class Cliente {
    private String nome;
    private double carteira;
    private int idade;

    // Construtor
    public Cliente(String nome, double carteira, int idade){
        this.nome = nome;
        this.carteira = carteira;
        this.idade = idade;
    }

    // Métodos
    public void comprar(Produto produto){
        carteira -= produto.getPreco();
        System.out.println(nome + " comprou " + produto.getNome() + " por " + produto.getPreco());
    }

    public void mostrarDinheiro(){
        System.out.println("Dinheiro na carteira de " + nome + ": " + carteira);
    }

    public void verificarIdade(){
        System.out.println(nome + " tem " + idade + " anos.");
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getCarteira() { return carteira; }
    public void setCarteira(double carteira) { this.carteira = carteira; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
}