import java.util.Scanner;
void main() {
    Scanner scanNum = new Scanner(System.in);
    System.out.println("Digite os numeros: ");
    double a, b, c;
    a=scanNum.nextDouble();
    b=scanNum.nextDouble();
    c=scanNum.nextDouble();

    Balanco objeto1 = new Balanco(a,b,c);
    System.out.println(objeto1.calcMedia());
}
