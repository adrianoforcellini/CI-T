package br.com;

import br.com.tarefas.ArrayTarefas;
import br.com.tarefas.ListarTarefas;
import br.com.tarefas.Tarefa;

public class Principal {
  public static void main(String[] args) {
    Tarefa tarefa1 = new Tarefa("Aproveitar o fim de semana estedido pra ver todo o módulo de Java ");
    Tarefa tarefa2 = new Tarefa("Criar a versão 2.0 do PJ webchat, que aquela bagunça dá não =P ");
    Tarefa tarefa3 = new Tarefa("Amar as pessoas como se não houvesse amanhã. ");

    tarefa1.exibirTarefa();
    System.out.println("A tarefa tem " + tarefa1.obterTamanhoTarefa() + " caracteres");
    tarefa2.exibirTarefa();
    System.out.println("A tarefa tem " + tarefa2.obterTamanhoTarefa() + " caracteres");
    tarefa3.exibirTarefa();
    System.out.println("A tarefa tem " + tarefa3.obterTamanhoTarefa() + " caracteres");
    System.out.println("-------------------------------------------------------------");

    ArrayTarefas tarefas = new ArrayTarefas(3);
    tarefas.adicionar(tarefa1);
    tarefas.adicionar(tarefa2);
    tarefas.adicionar(tarefa3);
    tarefas.exibirTarefas();

    System.out.println("-------------------------------------------------------------");

    ListarTarefas tarefas2 = new ListarTarefas();
    tarefas2.adicionar(tarefa1);
    tarefas2.adicionar(tarefa2);
    tarefas2.adicionar(tarefa3);
    tarefas2.exibirTarefas();
  }

}
