package list.CarrinhoCompras;

public class Itens {
    private final String nome;
    private final Double preco;
    private final Integer quantidade;

    public Itens(String nome, Double preco, Integer quantidade) {
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
        return "Itens(" + "nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + ")";
    }
}
