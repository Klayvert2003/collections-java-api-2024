package map.AgendaContatos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgendaContatos {
    private final Map<String, Integer> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        this.contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        this.contatosMap.remove(nome);
    }

    public void exibirContatos() {
        System.out.println("Os contatos são: " + this.contatosMap);
    }

    public void pesquisarPorNome(String nome) {
        System.out.println("O contato encontrado com o nome " + nome + " foi: " + this.contatosMap.get(nome));
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Klayvert", 986028206);
        agendaContatos.adicionarContato("José", 556465464);
        agendaContatos.adicionarContato("Manoel", 656464666);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Manoel");
        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("Klayvert");
    }
}
