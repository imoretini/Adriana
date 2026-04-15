
public class Bebidas {
    private String nome;
    private int volume;
    private String sabor;
    private  int quantIngerida;

    //construtor
    public Bebidas(String nome, int volume, int quantIngerida, String sabor) {
        this.nome = nome;
        this.volume = volume;
        this.sabor = sabor;
    }

    public void matarSede(){
        if(quantIngerida < volume){
            IO.println("Não matou a sede.");
        }
        else {
            IO.println("Você matou sua sede");
        }

    }

    public void molhar() {
        if (quantIngerida > 0) {
            System.out.println("Você molhou a boca com " + nome);
        } else {
            System.out.println("Nenhuma bebida ingerida.");
        }
    }

    public void verificarSabor() {
        System.out.println("O sabor da bebida é: " + sabor);
    }

}
