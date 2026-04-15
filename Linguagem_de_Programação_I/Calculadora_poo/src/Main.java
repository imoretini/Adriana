import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner s = new Scanner(System.in);
    IO.println("Digite os numeros");
    int a,b;
    a=s.nextInt();
    b=s.nextInt();
    Operacao o = new Operacao(a,b);
    IO.println(o.dividir());
}
