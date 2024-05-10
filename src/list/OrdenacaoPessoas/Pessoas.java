package list.OrdenacaoPessoas;

import java.util.Comparator;

public class Pessoas implements Comparable<Pessoas>{
    private final String nome;
    private final Integer idade;
    private final double altura;

    public Pessoas(String nome, Integer idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoas(" + "nome=" + nome + ", idade=" + idade + ", altura=" + altura + ")";
    }

    @Override
    public int compareTo(Pessoas p) {
        return idade.compareTo(p.idade);
    }
}

class CompararAltura implements Comparator<Pessoas> {

    @Override
    public int compare(Pessoas p1, Pessoas p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
