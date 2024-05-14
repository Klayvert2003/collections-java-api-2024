package set.CadastroProdutos;

import java.util.Comparator;
import java.util.Objects;

public class Produto {
    private final Long cod;
    private final String nome;
    private final Double preco;
    private final Integer quantidade;

    public Produto(Long cod, String nome, Double preco, Integer quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return Objects.equals(getNome(), produto.getNome()) && Objects.equals(getCod(), produto.getCod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCod());
    }

    @Override
    public String toString() {
        return "Produto(" + "nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", quantidade=" + quantidade + ")";
    }

    public String getNome() {
        return nome;
    }

    public Long getCod() {
        return cod;
    }

    public Double getPreco() {
        return preco;
    }
}

class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}

class ComparatorPorNome implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return String.CASE_INSENSITIVE_ORDER.compare(p1.getNome(), p2.getNome());
    }
}