public class Balanco {
    private int jan;
    private int fev;
    private int mar;

    public void setFev(int fev) {

        this.fev = fev;
    }

    public void setJan(int jan) {
        this.jan = jan;
    }

    public void setMar(int mar) {
        this.mar = mar;
    }
    public int somar(){
        return(jan+fev+mar);
    }
    public double calcMedia(){
        double media;
                media=somar()/3;
        return media;
    }
}
