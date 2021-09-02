package Encapsulamento;

public class ContaBancaria {
    private double Saldo = 0;
    private String Nome;

    // ao utilizar o private ao invés de public, somente será permitido alterar o valor do saldo com os metodos;
    public void deposita(double Valor) {
        this.Saldo = this.Saldo + Valor + (Valor * 0.10);
    }

    public void saca(double Valor) {
        this.Saldo = this.Saldo - Valor;
    }

    // como não se pode mais acessar diretamente Saldo, é necessario criar um metodo que retorne o valor:
    // "Getter, um método que foi feito só com o intuito de retornar um valor de um atributo privado."
    public double getSaldo() {
        return this.Saldo;
    }
    // Outro conceito é o do Setter, que nada mais é que um método com o intuito de alterar o valor de nosso
    // atributo privado. Faremos ambos para o atributo Nome de nossa classe:

    public void setNome(String N) {
        this.Nome = N;
    }

    public String getNome() {
        return this.Nome;
    }
    // Isso tudo, é para encapsular nossa classe, ou seja, fazer com que o único meio
    // de alterar atributos nela contidos seja através de seus próprios métodos.
}
