package Herança;

import java.util.Date;

public class Pessoa {
    public String nome;
    public String cpf;
    public Date data_nascimento;
    public Pessoa(String _nome, String _cpf, Date _data) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.data_nascimento = _data;
    }
    // ao adicionar final double, qualquer outra classe estaria proibida de sobreescrever tirarCopias
    public double tirarCopias(int qtd) { //Retorna o preço para tirar copias
        return 0.10 * (double) qtd;
    }
}
