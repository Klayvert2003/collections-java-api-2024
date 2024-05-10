package set.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private final Set<Convidado> convidadoList;

    public ConjuntoConvidados() {
        this.convidadoList = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoList.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        if (!convidadoList.isEmpty()) {
            convidadoList.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);
        }
    }

    public void contarConvidados() {
        System.out.println("A quantidade de convidados é: " + convidadoList.size());
    }

    public void exibirConvidados() {
        System.out.println("Os convidados são: " + convidadoList);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Klayvert", 4002);
        conjuntoConvidados.adicionarConvidado("Joãozinho", 8922);
        conjuntoConvidados.adicionarConvidado("teste", 8922);
        conjuntoConvidados.adicionarConvidado("Osvaldo", 123);

        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.contarConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(4002);

        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.contarConvidados();
    }
}
