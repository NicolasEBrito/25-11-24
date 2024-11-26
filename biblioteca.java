package biblioteca;

import java.util.Scanner;

public class biblioteca {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        library catalogo = new library();
        String author = "";
        String name = "";
        int pages = 0;
        // libro Libro1 = new libro("libro1", "autor1", 120);
        // libro Libro2 = new libro("libro2", "autor2", 180);
        // libro Libro3 = new libro("libro3", "autor3", 150);
        // catalogo.agregarLibros(Libro1);
        // catalogo.agregarLibros(Libro2);
        // catalogo.agregarLibros(Libro3);
        // System.out.println(catalogo.getBiblio()[0].getTitulo());
        do {
            System.out.println("\nMenu");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Mostrar detalles de libros");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese título, autor y número de páginas");
                    name = scan.nextLine();
                    author = scan.nextLine();
                    pages = scan.nextInt();
                    libro test = new libro(name, author, pages);
                    catalogo.agregarLibros(test);
                }

                case 2 -> {
                    for (int i = 0; i < library.getContador(); i++) {
                        System.out.println(catalogo.biblio[i].getTitulo());
                        System.out.println(catalogo.biblio[i].getAutor());
                        System.out.println(catalogo.biblio[i].getNroDePaginas());
                    }
                }
                case 3 ->
                    System.out.println("Saliendo del menú");

                default -> {
                    System.out.println("Opcion invalida, ingrese nuevamente");
                }
            }
        } while (opcion != 3);
        scan.close();
    }
};