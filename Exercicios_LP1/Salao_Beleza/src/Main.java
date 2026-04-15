public class Main {
    public static void main(String[] args) {
        //Testando classe Servico
        Servico corte = new Servico("Corte de cabelo", 30, 35);
        corte.atrasar();
        corte.pontual();
        corte.rapido();

        //Testando classe Cliente
        Cliente maria = new Cliente("Maria", true, false);
        maria.elogiar();
        maria.reclamar();
        maria.voltar();

        //Testando classe Profissional
        Profissional joao = new Profissional("João", 6, 120);
        joao.atender();
        joao.avaliarExperiencia();
        joao.contarServicos();
    }
}
