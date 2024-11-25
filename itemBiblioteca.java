package biblioteca;

public abstract class itemBiblioteca implements Catalogable {
    public abstract void Prestar();

    public abstract void Devolver();

    public abstract double calcularMulta();
}
