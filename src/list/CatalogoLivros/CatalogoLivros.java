package list.CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private final List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        if (!livroList.isEmpty()) {
            List<Livro> livrosEncontrados = new ArrayList<>();

            for (Livro livro : livroList) {
                if (livro.getAutor().equals(autor)) {
                    livrosEncontrados.add(livro);
                }
            }

            return livrosEncontrados;
        }
        throw new RuntimeException("Lista de livros vazia");
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        if (!livroList.isEmpty()) {
            List<Livro> livrosEncontrados = new ArrayList<>();

            for (Livro livro : livroList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosEncontrados.add(livro);
                }
            }

            return livrosEncontrados;
        }

        throw new RuntimeException("Lista de livros vazia");
    }

    public Livro pesquisaPorTitulo(String titulo) {
        if (!livroList.isEmpty()) {
            Livro livroEncontrado = new Livro();

            for (Livro livro : livroList) {
                if (livro.getTitulo().equals(titulo)) {
                    livroEncontrado = livro;
                    break;
                }
            }

            return livroEncontrado;
        }

        throw new RuntimeException("Lista de livros vazia");
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("livro teste", "klayvert", 2012);
        catalogoLivros.adicionarLivro("livro teste2", "klayvert", 2015);
        catalogoLivros.adicionarLivro("livro teste3", "joãozinho", 2009);
        catalogoLivros.adicionarLivro("livro teste4", "marcelo", 2020);

        List<Livro> livrosPorAutor = catalogoLivros.pesquisaPorAutor("klayvert");
        System.out.println(livrosPorAutor);

        List<Livro> livrosPorIntervaloDeAnos = catalogoLivros.pesquisaPorIntervaloAnos(2010, 2020);
        System.out.println(livrosPorIntervaloDeAnos);

        Livro livroPorTitulo = catalogoLivros.pesquisaPorTitulo("livro teste2");
        System.out.println(livroPorTitulo);
    }
}
