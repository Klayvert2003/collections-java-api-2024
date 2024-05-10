package set.AgendaContatos;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AgendaContatos {
    private final Set<Contatos> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contatos(nome, numero));
    }

    public void exibirContatos() {
        System.out.println("Os contatos são: " + contatosSet);
    }

    public void pesquisarPorNome(String nome) {
        if (!contatosSet.isEmpty()) {
            contatosSet.stream()
                    .filter(n -> n.getNome().equalsIgnoreCase(nome))
                    .map(n -> "O nome: '" + nome + "' está presente no conjunto")
                    .forEach(System.out::println);
        }
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        if (!contatosSet.isEmpty()) {
            contatosSet.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
            this.adicionarContato(nome, novoNumero);
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("bom dia e companhia", 40028922);
        agendaContatos.adicionarContato("klayvert", 123123123);
        agendaContatos.adicionarContato("joãozinho", 312312312);

        agendaContatos.exibirContatos();

        agendaContatos.pesquisarPorNome("klayvert");

        agendaContatos.atualizarNumeroContato("bom dia e companhia", 123123123);
        agendaContatos.exibirContatos();
    }
}
