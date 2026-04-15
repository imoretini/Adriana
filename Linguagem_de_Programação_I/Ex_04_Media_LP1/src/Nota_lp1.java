public class Nota_lp1 {
    //atributos
    private double p1;
    private double e1;
    private double e2;
    private double x;
    private double sub;
    private double api;
    private double mediaP;
    private double mediaF;
    private double exf;

    //contrutor iniciando variavel em nulo e em valor do parametro externo.
    public Nota_lp1 (){}
    public Nota_lp1 (double p1, double e1, double e2, double x, double sub, double api) {
        this.p1=p1;
        this.e1=e1;
        this.e2=e2;
        this.x=x;
        this.sub=sub;
        this.api=api;

    }

    //Metodo
    public double mediaPonderada(){
        mediaP = ((p1*0.5)+(e1*0.2)+(e2*0.3)+x);
        return mediaP;
    }
    /*public  double mediaFinalAPI(){
        if (mediaP > 5.9);{
            mediaF=(mediaP+api)*0.5;
                IO.println("Aprovado");
        }

        else {
            mediaF=((mediaP*0.5)+exf);
                if (mediaF>6);
            {
                IO.println("Aprovado");
            }
                else{
                    IO.println("Reprovado");}
            }
        }
    }*/




}
