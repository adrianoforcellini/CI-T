package br.com;

import br.com.tarefas.ArrayTarefas;
import br.com.tarefas.ListarTarefas;
import br.com.tarefas.Tarefa;

public class Principal {
  public static void main(String[] args) {
    Tarefa tarefa1 = new Tarefa("Aproveitar o fim de semana estedido pra ver todo o módulo de Java ");
    Tarefa tarefa2 = new Tarefa("Criar a versão 2.0 do PJ webchat, que aquela bagunça dá não =P");
    Tarefa tarefa3 = new Tarefa("Amar as pessoas como se não houvesse amanhã. ");
    Tarefa tarefa4 = new Tarefa("Desistir");

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
    tarefas2.adicionar(tarefa4);
    tarefas2.exibirTarefas();

    System.out.println("-------------------------------------------------------------");
    System.out.println("Minha tarefas após remover:");
    System.out.println("Removendo posição que não existe : Posição 3 ( não adicionada por ser inválida)");
    tarefas2.remover(3);
    System.out.println("---------------------------------------------");
    System.out.println("Removendo posição 2 e exibindo:");
    tarefas2.remover(2);
    tarefas2.exibirTarefas();
    System.out.println("---------------------------------------------");
    System.out.println("Readicionando, afinal é preciso:");
    tarefas2.adicionar(tarefa3);
    tarefas2.exibirTarefas();
    System.out.println("-------------------------------------------------------------");
    System.out.println("Removendo por tarefa");
    tarefas2.remover(tarefa1);
    tarefas2.exibirTarefas();
    System.out.println("---------------------------------------------");
    System.out.println("-Apagar a mesma tarefa com esse método não causaráa erro");
    // esse não causará erro caso a tarefa não exista.
    tarefas2.remover(tarefa1);
    tarefas2.exibirTarefas();

    System.out.println("-------------------------------------------------------------");
    System.out.println("-Buscar Tarefa-");
    tarefas2.buscar("Xablau");
    Tarefa buscar = tarefas2.buscar("Criar a versão 2.0 do PJ webchat, que aquela bagunça dá não =P");
    buscar.exibirTarefa();
  }
}
