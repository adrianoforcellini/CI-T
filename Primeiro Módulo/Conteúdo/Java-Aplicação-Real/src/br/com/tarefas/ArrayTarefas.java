package br.com.tarefas;

public class ArrayTarefas {
  Tarefa[] tarefas;
  int index = 0;

  public ArrayTarefas(int tamanho) {
    tarefas = new Tarefa[tamanho];
  }

  public void adicionar(Tarefa tarefa) {
    tarefas[index] = tarefa;
    index++;
  }

  public void remover(int posicao) {
    tarefas[posicao] = null;
  }

  public void exibirTarefas() {
    for (Tarefa tarefa : tarefas) {
      if (tarefas != null) {
        tarefa.exibirTarefa();
      }
    }
  }
}
