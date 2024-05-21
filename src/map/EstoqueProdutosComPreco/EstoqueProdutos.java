package map.EstoqueProdutosComPreco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstoqueProdutos {
    private final Map<Long, Produto> produtoMap;

    public EstoqueProdutos() {
        this.produtoMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, Integer quantidade, Double preco) {
        this.produtoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println("Os produtos são: " + new ArrayList<>(this.produtoMap.values()));
    }

    public void calcularValorTotalEstoque() {
        double total = 0.0;

        for (Produto p : this.produtoMap.values()) {
            total += p.getPreco() * p.getQuantidade();
        }

        System.out.println("O valor total do estoque é: " + total);
    }

    public void obterProdutoMaisCaro() {
        double total = 0.0;
        List<Long> listValues = new ArrayList<>();

        for (Map.Entry<Long, Produto> item : this.produtoMap.entrySet()) {
            if (item.getValue().getPreco() > total) {
                total = item.getValue().getPreco();
                listValues.add(item.getKey());
            }
        }

        System.out.println(this.produtoMap.get(listValues.getLast()));
    }

    public void obterProdutoMaisBarato() {
        double total = 0.0;
        List<Long> listValues = new ArrayList<>();

        for (Map.Entry<Long, Produto> item : this.produtoMap.entrySet()) {
            if (item.getValue().getPreco() > total) {
                total = item.getValue().getPreco();
                listValues.add(item.getKey());
            }
        }

        System.out.println(this.produtoMap.get(listValues.getFirst()));
    }

    public void obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        double total = 0.0;
        List<Long> listValues = new ArrayList<>();

        for (Map.Entry<Long, Produto> item : this.produtoMap.entrySet()) {
            if (item.getValue().getPreco() * item.getValue().getQuantidade() > total) {
                total = item.getValue().getPreco() * item.getValue().getQuantidade();
                listValues.add(item.getKey());
            }
        }

        System.out.println(this.produtoMap.get(listValues.getLast()));
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "Bala xita", 1, 15.0);
        estoqueProdutos.adicionarProduto(2L, "Boné", 2, 30.0);
        estoqueProdutos.adicionarProduto(4L, "Bolsa", 1, 130.0);
        estoqueProdutos.adicionarProduto(3L, "Camisa", 2, 40.0);
        estoqueProdutos.exibirProdutos();
        estoqueProdutos.calcularValorTotalEstoque();
        estoqueProdutos.obterProdutoMaisCaro();
        estoqueProdutos.obterProdutoMaisBarato();
        estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    }
}
