package map.EstoqueProdutosComPreco;

public class Produto {
    private final String nome;
    private final Double preco;
    private final Integer quantidade;

    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto(" + "nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + ")";
    }
}
