package org.example;

public class Servico {
    //Atributos
    private String nome;
    private int tempoPrevisto;
    private int tempoRealizado;

    //Construtor
    public Servico(String nome, int tempoPrevisto, int tempoRealizado) {
        this.nome = nome;
        this.tempoPrevisto = tempoPrevisto;
        this.tempoRealizado = tempoRealizado;
    }

    //Métodos
    public void atrasar() {
        if (tempoRealizado > tempoPrevisto) {
            System.out.println("O serviço demorou mais que o previsto.");
        }
    }

    public void pontual() {
        if (tempoRealizado == tempoPrevisto) {
            System.out.println("Serviço realizado no tempo certo.");
        }
    }

    public void rapido() {
        if (tempoRealizado < tempoPrevisto) {
            System.out.println("Serviço concluído mais rápido que o esperado!");
        }
    }
}

