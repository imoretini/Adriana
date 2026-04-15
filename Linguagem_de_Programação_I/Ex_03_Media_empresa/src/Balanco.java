public class Balanco {
    //Definir atributos
    private double jan;
    private double fev;
    private double mar;

    //definir metodos
    public double somar () {
        return (jan+fev+mar);
    }

    public double calcMedia() {
        return ((jan+fev+mar)/3);
    }

    public Balanco(){}
    public Balanco(double jan, double fev, double mar) {
        this.jan = jan;
        this.fev = fev;
        this.mar = mar;
    }
}
