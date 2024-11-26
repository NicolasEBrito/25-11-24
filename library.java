package biblioteca;

import java.util.Arrays;

public class library {
    static int contador = 0;
    libro[] biblio = new libro[3];
    libro primerLibro = new libro("Primer Libro", "Primer Autor", 100);
    libro segundoLibro = new libro("Segundo Libro", "Segundo Autor", 80);
    libro tercerLibro = new libro("Tercer Libro", "Tercer Autor", 150);

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        library.contador = contador;
    }

    public libro[] getBiblio() {
        return biblio;
    }

    public void setBiblio(libro[] biblio) {
        this.biblio = biblio;
    }

    public libro getPrimerLibro() {
        return primerLibro;
    }

    public void setPrimerLibro(libro primerLibro) {
        this.primerLibro = primerLibro;
    }

    public libro getSegundoLibro() {
        return segundoLibro;
    }

    public void setSegundoLibro(libro segundoLibro) {
        this.segundoLibro = segundoLibro;
    }

    public libro getTercerLibro() {
        return tercerLibro;
    }

    public void setTercerLibro(libro tercerLibro) {
        this.tercerLibro = tercerLibro;
    }

    public library() {
    }

    public void agregarLibros(libro x) {
        biblio[contador] = x;
        contador++;
    }

    public void prestar(libro x, persona y) {
        if (x.isPrestado() == false) {
            x.setPrestado(true);
            y.prestados = Arrays.copyOf(y.prestados, (y.prestados.length + 1));
            y.prestados[y.prestados.length - 1] = x;
        } else {
            System.out.println("El libro ya está prestado");
        }
    }

    public void devolver(libro x) {
        if (x.isPrestado() == true) {
            x.setPrestado(false);
        } else {
            System.out.println("El libro ya estaba en la biblioteca");
        }
    }
}
