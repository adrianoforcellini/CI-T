package br.com.tarefas;

import java.util.ArrayList;

public class ListarTarefas {
  ArrayList<Tarefa> tarefas = new ArrayList<>();
// <> diamond operator : entende que é o mesmo operador supracitado na linha de código.

  public void adicionar(Tarefa tarefa) {
    if (tarefa != null && tarefa.obterTamanhoTarefa() > 20) {
      this.tarefas.add(tarefa);
    } else {
      System.out.println("Essa é uma tarefa inválida!");
    }
  }

  public void remover(int posicao) {
    if (posicao < this.tarefas.size()) {
      this.tarefas.remove(posicao);
    } else {
      System.out.println("A tarefa não existe.");
    }
  }

  public void remover(Tarefa tarefa) {
    this.tarefas.remove(tarefa);
  }

  public Tarefa buscar(String descricao) {
    for (Tarefa tarefa : tarefas) {
      if (descricao.equals(tarefa.descricao)) {
        return tarefa;
      }
    }
    System.out.println("Tarefa não encontrada");
    return null;
  }

  public void exibirTarefas() {
    for (Tarefa tarefa : tarefas) {
      tarefa.exibirTarefa();
    }
  }
}
