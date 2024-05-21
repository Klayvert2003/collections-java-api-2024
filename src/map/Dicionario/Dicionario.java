package map.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private final Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        this.dicionarioMap.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println("As palavras são: " + this.dicionarioMap);
    }

    public void pesquisarPorPalavra(String palavra) {
        System.out.println("A definição da palavra '" + palavra + "' é: " + this.dicionarioMap.get(palavra));
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Serenidade", "Uma sensação de calma e paz interior");
        dicionario.adicionarPalavra("Gratidão", "Sentimento de apreciação e reconhecimento por algo recebido ou experimentado");
        dicionario.adicionarPalavra("Harmonia", "Um estado de equilíbrio e acordo entre diferentes elementos, resultando em uma sensação de tranquilidade");
        dicionario.adicionarPalavra("Amizade", "Um relacionamento de afeto, apoio e camaradagem entre pessoas");
        dicionario.exibirPalavras();

        dicionario.removerPalavra("Serenidade");
        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("Amizade");
    }
}
