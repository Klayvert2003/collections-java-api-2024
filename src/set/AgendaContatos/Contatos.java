package set.AgendaContatos;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contatos contatos)) return false;
        return Objects.equals(getNome(), contatos.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }
}
