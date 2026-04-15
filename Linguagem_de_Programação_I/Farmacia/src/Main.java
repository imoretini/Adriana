public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Cliente cliente1 = new Cliente("Ieda", "12345678901", 33);
        Bebidas bebida1 = new Bebidas("Suco de Laranja", 500, 300, "Doce");
        Remedio remedio1 = new Remedio("Xarope Tosse", 10, 5);

        // Testando métodos da classe Cliente
        cliente1.mostrarDados();
        cliente1.verificaIdade();
        cliente1.verificaCpf();

        // Testando métodos da classe Bebidas
        bebida1.matarSede();
        bebida1.molhar();
        bebida1.verificarSabor();

        // Testando métodos da classe Xarope
        remedio1.aliviaSintoma();
        remedio1.intoxicar();
        remedio1.naoFuncionar();
    }
}
