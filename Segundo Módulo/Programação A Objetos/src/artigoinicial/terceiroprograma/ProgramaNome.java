package artigoinicial.terceiroprograma;

import artigoinicial.segundoprograma.Pessoa;

public class ProgramaNome {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("James", "Clerk", "Maxwell");
        Pessoa pessoa2 = new Pessoa("Adriano", "Forcellini", "Pedretti");

        System.out.println(pessoa1.getNomeCompleto());
        System.out.println(pessoa2.getNomeCompleto());

    }

}