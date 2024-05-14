package set.CadastroProdutos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CadastroProdutos {
    private final Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(Long cod, String nome, Double preco, Integer quantidade){
        this.produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public void exibirProdutosPorNome() {
        System.out.println("A lista ordenada por nome é: " +
                this.produtoSet
                        .stream()
                        .sorted(new ComparatorPorNome())
                        .collect(Collectors.toCollection(LinkedHashSet::new)));
    }

    public void exibirProdutosPorPreco() {;
        System.out.println("A lista ordenada por preço é: " +
                this.produtoSet
                        .stream()
                        .sorted(new ComparatorPorPreco())
                        .collect(Collectors.toCollection(LinkedHashSet::new)));
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "bermuda", 50.0, 1);
        cadastroProdutos.adicionarProduto(2L, "calça jeans", 80.0, 2);
        cadastroProdutos.adicionarProduto(3L, "camiseta gola polo", 60.0, 3);
        cadastroProdutos.adicionarProduto(4L, "camiseta regata", 30.0, 2);
        cadastroProdutos.adicionarProduto(5L, "jaqueta de couro", 200.0, 1);
        cadastroProdutos.exibirProdutosPorNome();
        cadastroProdutos.exibirProdutosPorPreco();
    }
}
