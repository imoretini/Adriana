package org.example;

public class Cliente {
    //Atributos
    private String nome;
    private boolean satisfeito;
    private boolean reclamou;

    //Construtor
    public Cliente(String nome, boolean satisfeito, boolean reclamou) {
        this.nome = nome;
        this.satisfeito = satisfeito;
        this.reclamou = reclamou;
    }

    //Métodos
    public void elogiar() {
        if (satisfeito.equals("Sim") || satisfeito.equals("sim")) {
            System.out.println(nome + " elogiou o atendimento!");
        }
    }

    public void reclamar() {
        if (reclamou.equals("Sim") || reclamou.equals("sim")) {
            System.out.println(nome + " fez uma reclamação.");
        }
    }

    public void voltar() {
        if (satisfeito && !reclamou) {
            System.out.println(nome + " voltará ao salão.");
        }
    }
}
