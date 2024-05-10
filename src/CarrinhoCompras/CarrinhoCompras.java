package CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private final List<Itens> itensList;

    public CarrinhoCompras() {
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade) {
        itensList.add(new Itens(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Itens> removeItensList = new ArrayList<>();

        for (Itens item : itensList) {
            if (item.getNome().equals(nome)) {
                removeItensList.add(item);
            }
        }

        itensList.removeAll(removeItensList);
    }

    public void calculaValorTotal() {
        double total = 0.0;

        for (Itens item : itensList) {
            double unitValue = item.getPreco() * item.getQuantidade();
            total += unitValue;
        }

        System.out.println("O valor total dos itens é: " + total);;
    }

    public void exibirItens() {
        System.out.println("A lista de itens é: " + itensList);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("teste", 10.0, 2);
        carrinhoCompras.adicionarItem("teste", 10.0, 2);
        carrinhoCompras.adicionarItem("teste2", 5.0, 2);
        carrinhoCompras.exibirItens();
        carrinhoCompras.calculaValorTotal();
        carrinhoCompras.removerItem("teste");
        carrinhoCompras.exibirItens();
        carrinhoCompras.calculaValorTotal();
    }
}
