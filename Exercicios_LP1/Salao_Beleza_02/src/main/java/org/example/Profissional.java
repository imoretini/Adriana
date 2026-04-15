package org.example;

public class Profissional {
    //Atributos
    private String nome;
    private int experiencia;
    private int servicosRealizados;

    //Construtor
    public Profissional(String nome, int experiencia, int servicosRealizados) {
        this.nome = nome;
        this.experiencia = experiencia;
        this.servicosRealizados = servicosRealizados;
    }

    //Métodos
    public void atender() {
        System.out.println(nome + " está atendendo um cliente.");
    }

    public void avaliarExperiencia() {
        if (experiencia > 5) {
            System.out.println(nome + " é um profissional experiente.");
        } else {
            System.out.println(nome + " ainda está em início de carreira.");
        }
    }

    public void contarServicos() {
        System.out.println(nome + " já realizou " + servicosRealizados + " serviços.");
    }
}
