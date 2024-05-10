package set.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private final Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicas.isEmpty()) {
            palavrasUnicas.removeIf(p -> p.equalsIgnoreCase(palavra));
        }
    }

    public void verificarPalavra(String palavra) {
        if (!palavrasUnicas.isEmpty()) {
            palavrasUnicas.stream()
                    .filter(p -> p.contains(palavra))
                    .map(p -> "A palavra " + palavra + " está no conjunto como: '" + p + "'")
                    .forEach(System.out::println);
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println("O conjunto de palavras únicas é: " + palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("teste");
        palavrasUnicas.adicionarPalavra("teste2");
        palavrasUnicas.adicionarPalavra("teste3");

        palavrasUnicas.exibirPalavrasUnicas();
        palavrasUnicas.verificarPalavra("teste");
        palavrasUnicas.removerPalavra("teste3");
        palavrasUnicas.exibirPalavrasUnicas();
    }
}
