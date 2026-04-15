package org.example;

public class Produto {
    private String nome;
    private String categoria;
    private double preco;

    // Construtor
    public Produto(String nome, String categoria, double preco){
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    // Métodos
    public void exibirInfo(){
        System.out.println("Produto: " + nome + " | Categoria: " + categoria + " | Preço: " + preco);
    }

    public void aumentarPreco(double valor){
        preco += valor;
    }

    public void diminuirPreco(double valor){
        preco -= valor;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}
