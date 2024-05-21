package map.LivrariaOnline;

import map.AgendaEventos.Evento;

import javax.xml.transform.OutputKeys;
import java.util.*;
import java.util.stream.Collectors;

public class LivrariaOnline {
    private final Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        this.livroMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        List<String> linksList = new ArrayList<>();

        if (!this.livroMap.isEmpty()){
            for (Map.Entry<String, Livro> entry : this.livroMap.entrySet()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    linksList.add(entry.getKey());
                }
            }

            for (String link : linksList) {
                this.livroMap.remove(link);
            }
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        Map<String, Livro> sortedMap = this.getSortedMap();

        System.out.println(sortedMap);
    }

    public void pesquisarLivrosPorAutor(String autor) {
        List<Livro> livros = new ArrayList<>();

        for (Map.Entry<String, Livro> entry : this.livroMap.entrySet()) {
            if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                livros.add(entry.getValue());
            }
        }

        System.out.println("Os livros com o autor: " + autor + ", são: " + livros);
    }

    private Map<String, Livro> getSortedMap() {
        List<Map.Entry<String, Livro>> entries = new ArrayList<>(livroMap.entrySet());
        entries.sort(Comparator.comparingDouble(entry -> entry.getValue().getPreco()));

        return entries.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));
    }

    public void exibirLivroMaisBarato() {
        Map<String, Livro> sortedMap = this.getSortedMap();

        System.out.println(sortedMap.entrySet().iterator().next().getValue());
    }

    public void obterLivroMaisCaro() {
        Map<String, Livro> sortedMap = this.getSortedMap();
        Livro ultimoLivro = null;

        for (Livro livro : sortedMap.values()) {
            ultimoLivro = livro;
        }

        System.out.println(ultimoLivro);
    }

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("https://teste123.com.br", "livro_teste1", "autor_teste1", 20.0);
        livraria.adicionarLivro("https://teste1234.com.br", "livro_teste2", "autor_teste2", 50.0);
        livraria.adicionarLivro("https://teste1235.com.br", "livro_teste3", "autor_teste3", 120.0);
        livraria.adicionarLivro("https://teste1236.com.br", "livro_teste4", "autor_teste4", 320.0);
        livraria.adicionarLivro("https://teste1237.com.br", "livro_teste5", "autor_teste5", 10.0);

        livraria.exibirLivrosOrdenadosPorPreco();
        livraria.exibirLivroMaisBarato();
        livraria.obterLivroMaisCaro();
        livraria.pesquisarLivrosPorAutor("autor_teste3");
        livraria.removerLivro("livro_teste4");

        livraria.exibirLivrosOrdenadosPorPreco();
        livraria.exibirLivroMaisBarato();
        livraria.obterLivroMaisCaro();
    }
}
