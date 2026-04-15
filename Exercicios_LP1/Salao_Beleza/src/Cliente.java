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
        if (satisfeito) {
            IO.println(nome + " elogiou o atendimento!");
        }
    }

    public void reclamar() {
        if (reclamou) {
            IO.println(nome + " fez uma reclamação.");
        }
    }

    public void voltar() {
        if (satisfeito && !reclamou) {
            IO.println(nome + " voltará ao salão.");
        }
    }
}
