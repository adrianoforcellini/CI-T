package Encapsulamento;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();

        c1.setNome("Fulano da silva");
        c2.setNome("Beltrano de oliveira");

        c1.deposita(100);
        c2.deposita(200);

        System.out.println("c1 - Nome: "+c1.getNome());
        System.out.println("c1 - Saldo: "+c1.getSaldo());
        System.out.println("c2 - Nome: "+c2.getNome());
        System.out.println("c2 - Saldo: "+c2.getSaldo());
    }
}
