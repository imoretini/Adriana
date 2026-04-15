public class Operacao {
    private int num1;
    private int num2;
    public int somar(){
        return(num1+num2);
    }
    public int dividir(){
        return (num1/num2);
    }
    public Operacao(){} //Construtor sem parametro.
    public Operacao(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }// construtor com parametro


}
