package set.AgendaContatos;

public class Contatos {
    private String nome;
    private Integer numero;

    public Contatos(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contatos(" + "nome=" + nome + ", numero=" + numero + ")";
    }

    public String getNome() {
        return nome;
    }
}
