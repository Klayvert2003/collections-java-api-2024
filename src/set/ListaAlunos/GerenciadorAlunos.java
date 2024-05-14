package set.ListaAlunos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class GerenciadorAlunos {
    private final Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        this.alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        this.alunosSet.removeIf(a -> a.getMatricula() == matricula);
    }

    public void exibirAlunosPorNome() {
        System.out.println("Os alunos ordenados por nome são: " + this.alunosSet
                .stream()
                .sorted(new ComparatorPorNome())
                .collect(Collectors.toCollection(LinkedHashSet::new)));
    }

    public void exibirAlunosPorNota() {
        System.out.println("Os alunos ordenados por nota são : " + this.alunosSet
                .stream()
                .sorted(new ComparatorPorNota())
                .collect(Collectors.toCollection(LinkedHashSet::new)));
    }

    public void exibirAlunos() {
        System.out.println("Os alunos do conjunto são: " + this.alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Klayvert", 22L, 10.0);
        gerenciadorAlunos.adicionarAluno("José", 11L, 9.0);
        gerenciadorAlunos.adicionarAluno("Marcelo", 42L, 6.0);
        gerenciadorAlunos.adicionarAluno("Daniel", 72L, 2.0);

        System.out.println("Após remover o aluno com a matrícula 72L");
        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.removerAluno(72L);
        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
