package set.ListaTarefas;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaTarefas {
    private final Set<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefaList.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        this.tarefaList.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
    }

    public Set<Tarefa> exibirTarefas(){
        return tarefaList;
    }

    public void contarTarefas() {
        System.out.println("A quantia de tarefas é: " + this.tarefaList.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        return this.tarefaList
                .stream()
                .filter(Tarefa::isConclusao)
                .collect(Collectors.toSet());
    }

    public void marcarTarefaConcluida(String descricao) {
        this.tarefaList
                .stream()
                .filter(t -> t.getDescricao().equalsIgnoreCase(descricao))
                .filter(t -> !t.isConclusao())
                .forEach(t -> t.setConclusao(true));
    }

    public void marcarTarefaPendente(String descricao){
        this.tarefaList
                .stream()
                .filter(t -> t.getDescricao().equalsIgnoreCase(descricao))
                .filter(Tarefa::isConclusao)
                .forEach(t -> t.setConclusao(false));
    }

    public void limparListaTarefas() {
        this.tarefaList.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Teste 1");
        Set<Tarefa> tarefas = listaTarefas.exibirTarefas();
        System.out.println("As tarefas são: " + tarefas);
        listaTarefas.contarTarefas();
        listaTarefas.limparListaTarefas();
        listaTarefas.contarTarefas();

        listaTarefas.adicionarTarefa("Teste 2");
        Set<Tarefa> tarefasNew = listaTarefas.exibirTarefas();
        System.out.println("As tarefas são: " + tarefasNew);
        listaTarefas.contarTarefas();

        listaTarefas.marcarTarefaConcluida("Teste 2");
        Set<Tarefa> tarefasAtualizadas1 = listaTarefas.exibirTarefas();
        System.out.println("As tarefas atualizadas são: " + tarefasAtualizadas1);

        listaTarefas.marcarTarefaPendente("Teste 2");
        Set<Tarefa> tarefasAtualizadas2 = listaTarefas.exibirTarefas();
        System.out.println("As tarefas atualizadas são: " + tarefasAtualizadas2);

        listaTarefas.limparListaTarefas();
        Set<Tarefa> tarefasAtualizadas3 = listaTarefas.exibirTarefas();
        System.out.println("As tarefas após serem excluídas: " + tarefasAtualizadas3);
    }
}
