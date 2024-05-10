package set.ConjuntoConvidados;

import java.util.Objects;

public class Convidado {
    private final String nome;
    private final Integer codigoConvite;

    public Convidado(String nome, Integer codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public Integer getCodigoConvite() {
        return codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Convidado(" + "nome=" + nome + ", codigoConvite=" + codigoConvite + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return Objects.equals(getCodigoConvite(), convidado.getCodigoConvite());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }
}
