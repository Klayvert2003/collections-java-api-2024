package set.ConjuntoConvidados;

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
}
