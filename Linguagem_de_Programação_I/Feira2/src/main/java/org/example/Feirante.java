package org.example;

public class Feirante {
    private String nome;
    private Produto produtoPrincipal;
    private double saldo;

    // Construtor
    public Feirante(String nome, Produto produtoPrincipal, double saldo){
        this.nome = nome;
        this.produtoPrincipal = produtoPrincipal;
        this.saldo = saldo;
    }

    // Métodos
    public void vender(Cliente cliente){
        if(cliente.getCarteira() >= produtoPrincipal.getPreco()){
            cliente.comprar(produtoPrincipal);
            saldo += produtoPrincipal.getPreco();
            System.out.println(nome + " vendeu " + produtoPrincipal.getNome() + " para " + cliente.getNome());
        } else {
            System.out.println(cliente.getNome() + " não tem dinheiro suficiente.");
        }
    }

    // 👉 Método que estava faltando
    public void negociar(Produto produto, double novoPreco){
        produto.setPreco(novoPreco);
        System.out.println(nome + " negociou o preço do produto " + produto.getNome() + " para " + novoPreco);
    }

    public void mostrarSaldo(){
        System.out.println("Saldo do feirante " + nome + ": " + saldo);
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Produto getProdutoPrincipal() { return produtoPrincipal; }
    public void setProdutoPrincipal(Produto produtoPrincipal) { this.produtoPrincipal = produtoPrincipal; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
}
