public class Main {
    public static void main(String[] args) {
        Produto banana = new Produto("Banana", "Fruta", 2.50);
        Feirante joao = new Feirante("João", banana, 100.0);
        Cliente maria = new Cliente("Maria", 50.0, 25);

        banana.exibirInfo();
        joao.mostrarSaldo();
        maria.mostrarDinheiro();

        joao.vender(maria);
        maria.mostrarDinheiro();
        joao.mostrarSaldo();

        banana.aumentarPreco(0.50);
        banana.exibirInfo();

        joao.negociar(banana, 2.0);
        banana.exibirInfo();

        maria.verificarIdade();
    }
}
