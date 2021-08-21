package br.com.tarefas;

import java.util.ArrayList;

public class ListarTarefas {
  ArrayList<Tarefa> tarefas = new ArrayList<>();
// <> diamond operator entende que é o mesmo operador supracitado na linha de código

  public void adicionar(Tarefa tarefa) {
    this.tarefas.add(tarefa);
  }

  public void remover(int posicao) {
    this.tarefas.remove(posicao);
  }

  public void exibirTarefas() {
    for (Tarefa tarefa : tarefas) {
      tarefa.exibirTarefa();
    }
  }
}
