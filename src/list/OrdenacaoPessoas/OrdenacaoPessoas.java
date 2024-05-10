package list.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private final List<Pessoas> pessoasList;

    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoasList.add(new Pessoas(nome, idade, altura));
    }

    public List<Pessoas> ordenarPorIdade() {
        Collections.sort(pessoasList);
        return pessoasList;
    }

    public List<Pessoas> ordenarPorAltura() {
        pessoasList.sort(new CompararAltura());

        return pessoasList;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Klayvert", 20, 1.91);
        ordenacaoPessoas.adicionarPessoa("Joãozinho", 8, 1.40);
        ordenacaoPessoas.adicionarPessoa("Cleber", 48, 2.01);
        ordenacaoPessoas.adicionarPessoa("Murilo", 19, 1.78);
        ordenacaoPessoas.adicionarPessoa("Arthur", 19, 2.0);

        List<Pessoas> pessoasOrdenadasPorIdade = ordenacaoPessoas.ordenarPorIdade();
        System.out.println("A lista de pessoas ordenadas por idade é: " + pessoasOrdenadasPorIdade);

        List<Pessoas> pessoasOrdenadasPorAltura = ordenacaoPessoas.ordenarPorAltura();
        System.out.println("A lista de pessoas ordenada por altura é: " + pessoasOrdenadasPorAltura);
    }
}
