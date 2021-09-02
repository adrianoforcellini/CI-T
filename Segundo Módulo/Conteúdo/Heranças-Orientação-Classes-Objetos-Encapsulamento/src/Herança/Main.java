package Herança;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Aluno Anderson = new Aluno("Anderson Francisco", "123.456.789-00", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nAluno:\nNome: " + Anderson.nome);
        System.out.println("CPF: " + Anderson.cpf);
        System.out.println("Data de nascimento: " + Anderson.data_nascimento.toString());
        System.out.println("O Aluno pagará " + Math.round(Anderson.tirarCopias(100)) + " em cada 100 cópias.");

        Funcionario Emerson = new Funcionario("Emerson Soares", "714.369.789-00", new Date());
        System.out.println("\n\nFuncionario:\nNome: " + Emerson.nome);
        System.out.println("CPF: " + Emerson.cpf);
        System.out.println("Data de nascimento: " + Emerson.data_nascimento.toString());
        System.out.println("O Funcionario pagará " + Math.round(Emerson.tirarCopias(100)) + " em cada 100 cópias.");

    }

}

