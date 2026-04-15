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
        IO.println(nome + " está atendendo um cliente.");
    }

    public void avaliarExperiencia() {
        if (experiencia > 5) {
            IO.println(nome + " é um profissional experiente.");
        } else {
            IO.println(nome + " ainda está em início de carreira.");
        }
    }

    public void contarServicos() {
        IO.println(nome + " já realizou " + servicosRealizados + " serviços.");
    }
}
