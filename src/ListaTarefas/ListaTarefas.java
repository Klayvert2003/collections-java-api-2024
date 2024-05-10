package ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private final List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if (!tarefaList.isEmpty()) {
            List<Tarefa> tarefasParaRemover = new ArrayList<>();

            for (Tarefa tarefa : tarefaList) {
                if (tarefa.getDescricao().equals(descricao)) {
                    tarefasParaRemover.add(tarefa);
                }
            }

            tarefaList.removeAll(tarefasParaRemover);
        }
    }

    public void obterNumeroTotalTarefas() {
        System.out.println("A quantidade de itens na lista é: " + tarefaList.size());
    }

    public void obterDescricoesTarefas() {
        System.out.println("A lista de tarefas é: " + tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.obterNumeroTotalTarefas();

        for (int i = 1; i <= 10; i++) {
            tarefas.adicionarTarefa("teste"+ i);
            tarefas.adicionarTarefa("teste"+ i);
        }

        tarefas.obterDescricoesTarefas();
        tarefas.obterNumeroTotalTarefas();
        tarefas.removerTarefa("teste2");
        tarefas.obterNumeroTotalTarefas();
        tarefas.obterDescricoesTarefas();
    }
}
