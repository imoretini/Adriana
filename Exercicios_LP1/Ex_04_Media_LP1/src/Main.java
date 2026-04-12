import java.util.Scanner;

void main() {
    Scanner s = new Scanner(System.in);
    System.out.println("Digite, respectivamente os as notas da P1, E1, E2, X, SUB E API");
    Double a, b, c, d, e, f;
    a= s.nextDouble();
    b=s.nextDouble();
    c=s.nextDouble();
    d=s.nextDouble();
    e=s.nextDouble();
    f=s.nextDouble();

    Nota_lp1 obj1 = new Nota_lp1(a,b,c,d,e,f);

    System.out.println(obj1.mediaPonderada());
}
