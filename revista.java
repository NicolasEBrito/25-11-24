package biblioteca;

public class revista extends itemBiblioteca {
    int cantidad = 100;
    int nroEdicion = 2;
    String nombreRevista = "Revista de programación";

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public revista() {
    }

    public revista(int cantidad, int nroEdicion, String nombreRevista) {
        this.cantidad = cantidad;
        this.nroEdicion = nroEdicion;
        this.nombreRevista = nombreRevista;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("cantidad : " + cantidad + "\n" + "Número de edición: " + nroEdicion + "\n"
                + "Nombre de la revista: " + nombreRevista);

    }

    @Override
    public void Devolver() {
        cantidad += 1;
        System.out.println("Ahora hay " + cantidad + " de ejemplares.");

    }

    @Override
    public void Prestar() {
        if (cantidad < 1) {
            cantidad -= 1;
            System.out.println("Quedan " + cantidad + " ejemplares.");
        } else {
            System.out.println("No hay ejemplares disponibles para prestar");
        }

    }

    @Override
    public double calcularMulta() {
        // TODO Auto-generated method stub
        return 0;
    }

}
