package set.ListaAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Alunos {
    private final String nome;
    private final Long matricula;
    private final Double nota;

    public Alunos(String nome, Long matricula, Double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alunos alunos)) return false;
        return Objects.equals(matricula, alunos.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Alunos(" + "nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + ")";
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public Double getNota() {
        return nota;
    }
}

class ComparatorPorNome implements Comparator<Alunos> {
    @Override
    public int compare(Alunos a1, Alunos a2) {
        return String.CASE_INSENSITIVE_ORDER.compare(a1.getNome(), a2.getNome());
    }
}

class ComparatorPorNota implements Comparator<Alunos> {
    @Override
    public int compare(Alunos a1, Alunos a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}