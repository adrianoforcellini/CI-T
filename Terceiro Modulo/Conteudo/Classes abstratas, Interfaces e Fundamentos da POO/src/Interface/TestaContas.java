package Interface;

public class TestaContas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1200.20);
        cc.sacar(300);

        ContaPoupanca cp = new ContaPoupanca();
        cp.deposita(500.50);
        cp.sacar(25);


        GerarExtrato gerador = new GerarExtrato();
        gerador.geradorConta(cc);
        gerador.geradorConta(cp);
    }

}
