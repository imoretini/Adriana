package org.example;

public class Cliente {
    //atributos
    private String nome;
    private String cpf;
    private int idade;

    //construtor
    public Cliente(String nome, String cpf, int idade){
        this.nome=nome;
        this.cpf=cpf;
        this.idade=idade;
    }

    //metodos
    public void mostrarDados(){
        System.out.println("Cliente "+ nome +" CPF: " + cpf + " Idade: " +idade);
    }

    public void verificaIdade(){
        if(idade<18){
            IO.println("Cliente menor de idade. ");
        }
        else {
            IO.println("Cliente maior de 18 anos. Idade: "+ idade);
        }
    }

    public void verificaCpf(){
        if(cpf.length()==11){
            IO.println("CPF válido!");
        }
        else {
            IO.println("CPF inválido!");
        }
    }
}
