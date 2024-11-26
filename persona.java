package biblioteca;

public class persona {
    String nombre = "";
    String apellido = "";
    libro[] prestados = new libro[1];

    public persona(String nombre, String apellido, libro[] prestados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.prestados = prestados;
    }

    public persona() {
    }
}
