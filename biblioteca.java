package biblioteca;

public class biblioteca {
    public static void main(String[] args) {

        itemBiblioteca[] arrayEjemplo = { new revista(5, 5, "Batman"), new revista(25, 12, "Spiderman"),
                new revista(10, 10, "Thor") };
        for (itemBiblioteca revi : arrayEjemplo) {
            revi.Prestar();
            revi.Devolver();
            revi.obtenerInformacion();
        }
    }
}
