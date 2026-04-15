
public class Remedio {
    //Atributos
    private String nome;
    private int doseReceitada;
    private int doseIngerida;

    //construtor
    public Remedio(String nome, int doseIngerida, int doseReceitada) {
        this.nome = nome;
        this.doseReceitada = doseReceitada;
        this.doseIngerida = doseIngerida;
    }
    //Métodos
    public void naoFuncionar(){
                if (doseIngerida < doseReceitada){
                    IO.println("O remédio não aliviou a dor. Beba a dose correta.");
                }
        }

    public void intoxicar() {
        if (doseIngerida > doseReceitada) {
            IO.println("Atenção, busque um ambulatório médico. Você está intoxicado!");
        }
    }

    public void aliviaSintoma(){
         if (doseIngerida == doseReceitada){
             IO.println("Sintomas aliviados.");
         }
        }
    }


