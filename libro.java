package biblioteca;

public class libro extends itemBiblioteca {
    String titulo = "";
    String autor = "";
    int nroDePaginas = 0;

    public libro(String titulo, String autor, int nroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroDePaginas = nroDePaginas;
    }

    public libro() {
    }

    public void mostrarInformacion() {
        System.out.println("El título del libro es :" + titulo + "\nEl autor del libro es : " + autor
                + "\n El número de páginas es de : " + nroDePaginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroDePaginas() {
        return nroDePaginas;
    }

    public void setNroDePaginas(int nroDePaginas) {
        this.nroDePaginas = nroDePaginas;
    }

    @Override
    public void obtenerInformacion() {
        // TODO Auto-generated method stub

    }

    @Override
    public void Devolver() {
        // TODO Auto-generated method stub

    }

    @Override
    public void Prestar() {
        // TODO Auto-generated method stub

    }

    @Override
    public double calcularMulta() {
        // TODO Auto-generated method stub
        return 0;
    }

}
