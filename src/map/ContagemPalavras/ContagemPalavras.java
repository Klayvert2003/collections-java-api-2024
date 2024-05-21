package map.ContagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private final Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        this.palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!this.palavrasMap.containsKey(palavra)) {
            throw new RuntimeException("Palavra não encontrada");
        }

        this.palavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(this.palavrasMap);
    }

    public void encontrarPalavraMaisFrequente() {
        double contagem = 0.0;
        String palavra = null;

        for (Map.Entry<String, Integer> entry : this.palavrasMap.entrySet()) {
            if (entry.getValue() > contagem) {
                palavra = entry.getKey();
                contagem = entry.getValue();
            }
        }

        System.out.println("Chave: " + palavra + ", Contagem: " + this.palavrasMap.get(palavra));
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("teste", 2);
        contagemPalavras.adicionarPalavra("teste2", 1);
        contagemPalavras.adicionarPalavra("teste3", 6);
        contagemPalavras.adicionarPalavra("teste4", 3);

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("teste");
        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.encontrarPalavraMaisFrequente();
    }
}
