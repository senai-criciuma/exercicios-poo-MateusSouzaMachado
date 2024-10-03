package Exerc37;

public class Revista extends Livro {

    private int edicao;

    @Override
    public int getNumeroDePaginas() {
        return super.getNumeroDePaginas();
    }

    @Override
    public String getAutor() {
        return super.getAutor();
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public void setAutor(String autor) {
        super.setAutor(autor);
    }

    @Override
    public void setNumeroDePaginas(int numeroDePaginas) {
        super.setNumeroDePaginas(numeroDePaginas);
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }
}
