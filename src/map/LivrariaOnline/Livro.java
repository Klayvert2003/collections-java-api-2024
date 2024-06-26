package map.LivrariaOnline;

public class Livro {
    private final String titulo;
    private final String autor;
    private final double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro(" + "titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + ")";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }
}
